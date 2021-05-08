package com.example.stockmarketreactor;

import android.app.Application;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Flux;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;


public class Controller extends Application {


   // HttpClient webClient = HttpClient.create(ConnectionProvider.create("http://localhost:8080"));


    /*

    public Flux<Wallet> findWallet(String name)
    {
        return webClient.get()
                .uri("algo/wallet/" + name)
                .retrieve()
                .bodyToFlux(Wallet.class);
    }

*/


}
