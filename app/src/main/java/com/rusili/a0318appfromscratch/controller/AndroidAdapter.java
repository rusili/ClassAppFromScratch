package com.rusili.a0318appfromscratch.controller;

import com.rusili.a0318appfromscratch.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rusili.a0318appfromscratch.model.MyAndroid;
import com.rusili.a0318appfromscratch.view.AndroidViewHolder;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidViewHolder> {
    private List<MyAndroid> androids;

    public AndroidAdapter(List<MyAndroid> androids) {
        this.androids = androids;
    }

    @NonNull
    @Override
    public AndroidViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View childView = inflater.inflate(R.layout.view_android, viewGroup, false);
        return new AndroidViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidViewHolder androidViewHolder, int i) {
        androidViewHolder.onBind(androids.get(i));
    }

    @Override
    public int getItemCount() {
        return androids.size();
    }
}
