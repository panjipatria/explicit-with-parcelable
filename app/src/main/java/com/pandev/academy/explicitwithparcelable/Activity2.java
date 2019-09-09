package com.pandev.academy.explicitwithparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public static String _INFO_ = "_info_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv_info = (TextView)findViewById(R.id.tv_info);

        itemOrang orang = getIntent().getParcelableExtra(_INFO_);

        String item = "Nama : "+orang.getNama()+" Alamat : "+orang.getAlamat()+" Email : "+orang.getEmail();

        tv_info.setText(item);
    }
}
