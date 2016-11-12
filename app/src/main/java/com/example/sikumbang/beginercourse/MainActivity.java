package com.example.sikumbang.beginercourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sikumbang.beginercourse.activity.MoveActivity;
import com.example.sikumbang.beginercourse.activity.NamaActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNama;
    private Button btnCek, btnPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = (EditText) findViewById(R.id.edit_nama);
        btnCek = (Button) findViewById(R.id.btn_nama);
        btnPindah = (Button) findViewById(R.id.btn_pindah);

        final String nama = editNama.getText().toString();

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cekNama = new Intent(MainActivity.this, NamaActivity.class);
                cekNama.putExtra("NamaKamu", editNama.getText().toString());
                startActivity(cekNama);

            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MoveActivity.class));
                finish();
            }
        });

    }
}
