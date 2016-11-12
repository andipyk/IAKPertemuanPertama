package com.example.sikumbang.beginercourse.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sikumbang.beginercourse.R;

public class NamaActivity extends AppCompatActivity {

    private TextView tv_nama1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        tv_nama1 = (TextView) findViewById(R.id.tv_nama);

        Intent nama = getIntent();
        Bundle bundle = nama.getExtras();

        if (bundle != null){
            String yourName = (String) bundle.get("NamaKamu");
            tv_nama1.setText(yourName);
        }
    }
}
