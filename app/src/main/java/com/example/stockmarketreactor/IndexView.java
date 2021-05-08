package com.example.stockmarketreactor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IndexView extends AppCompatActivity {

    private String algoAddress;


    private Button searchWallet;
    private EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchWallet = findViewById(R.id.searchWalletButton);
        input = findViewById(R.id.algoAdressEditText);





    }


    public void walletButtonClicked(View v){

        algoAddress = input.getText().toString();




    }


}
