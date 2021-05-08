package com.example.stockmarketreactor;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;


import reactor.core.publisher.Flux;
import reactor.netty.http.client.HttpClient;

import static java.time.Duration.ofSeconds;
import static reactor.util.retry.Retry.backoff;

public class Controller extends Application {


    private HttpClient webClient;

    public Controller(HttpClient webClient){
        this.webClient = webClient;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Flux<Wallet> pricesFor(Wallet wallet){

        return webClient.get()
                .uri("http://localhost:8080/algo/wallet/{address}", wallet.getAddress())
                .bodyToFlux(Wallet.class)
                .retryWhen(backoff(5, ofSeconds(1)).maxBackoff(ofSeconds(20));

    }




}
