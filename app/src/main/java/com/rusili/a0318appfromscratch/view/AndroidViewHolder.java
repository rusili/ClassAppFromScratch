package com.rusili.a0318appfromscratch.view;

import com.rusili.a0318appfromscratch.R;
import com.rusili.a0318appfromscratch.SecondActivity;
import com.rusili.a0318appfromscratch.model.MyAndroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class AndroidViewHolder extends RecyclerView.ViewHolder {
    private TextView verText;
    private TextView nameText;
    private TextView apiText;

    public static final String VER = "ver";
    public static final String NAME = "name";
    public static final String API = "api";

    public AndroidViewHolder(@NonNull View itemView) {
        super(itemView);
        verText = itemView.findViewById(R.id.text_ver);
        nameText = itemView.findViewById(R.id.text_name);
        apiText = itemView.findViewById(R.id.text_api);
    }

    public void onBind(final MyAndroid android) {
        ((TextView) itemView.findViewById(R.id.text_ver)).setText(android.getVer());
        nameText.setText(android.getName());
        apiText.setText(android.getApi());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(), SecondActivity.class);
                intent.putExtra(VER, android.getVer());
                intent.putExtra(NAME, android.getName());
                intent.putExtra(API, android.getApi());
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
