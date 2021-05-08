package com.example.stockmarketreactor;


import java.time.LocalDateTime;


public class Wallet {

        private String address;
        public String name;
        public int amount;
        public LocalDateTime time;


        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}

