package com.rusili.a0318appfromscratch.network;

import com.rusili.a0318appfromscratch.model.AndroidList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidService {

    @GET("android/jsonandroid/")
    Call<AndroidList> getAndroid();
}
