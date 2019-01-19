package com.rusili.a0318appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.rusili.a0318appfromscratch.controller.AndroidAdapter;
import com.rusili.a0318appfromscratch.model.AndroidList;
import com.rusili.a0318appfromscratch.model.MyAndroid;
import com.rusili.a0318appfromscratch.network.AndroidService;
import com.rusili.a0318appfromscratch.network.RetroFitSingleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetroFitSingleton.getInstance();
        final RecyclerView recyclerView = findViewById(R.id.recycler_view);


        retrofit.create(AndroidService.class)
                .getAndroid()
                .enqueue(new Callback<AndroidList>() {
                    @Override
                    public void onResponse(Call<AndroidList> call, Response<AndroidList> response) {
                        Log.d(TAG, "OnResponse: " + response.body()
                                .getAndroidList()
                                .get(0)
                                .getName());

                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                        AndroidAdapter androidAdapter = new AndroidAdapter(response.body().getAndroidList());
                        recyclerView.setLayoutManager(linearLayoutManager);
                        recyclerView.setAdapter(androidAdapter);

                    }

                    @Override
                    public void onFailure(Call<AndroidList> call, Throwable t) {
                        Log.d(TAG, "OnFailure: " + t.getMessage());
                    }
                });
    }
}
