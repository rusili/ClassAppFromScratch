package com.rusili.a0318appfromscratch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rusili.a0318appfromscratch.view.AndroidViewHolder;

import static com.rusili.a0318appfromscratch.view.AndroidViewHolder.VER;

public class SecondActivity extends AppCompatActivity {
    private TextView verTv;
    private TextView nameTv;
    private TextView apiTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        verTv = findViewById(R.id.ver_tv);
        nameTv = findViewById(R.id.name_tv);
        apiTv = findViewById(R.id.api_tv);

        Intent intent = getIntent();
        verTv.setText(intent.getStringExtra(VER));
        nameTv.setText(intent.getStringExtra(AndroidViewHolder.NAME));
        apiTv.setText(intent.getStringExtra(AndroidViewHolder.API));

    }
}
