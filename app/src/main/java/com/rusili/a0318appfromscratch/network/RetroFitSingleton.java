package com.rusili.a0318appfromscratch.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitSingleton {
    private static Retrofit instance;

    private RetroFitSingleton() {
    }

    public static Retrofit getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Retrofit.Builder()
                .baseUrl("https://api.learn2crack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return instance;
    }
}
