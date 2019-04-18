package com.unikom.ilham.latihan2_akb11_10116496_ilhamprasetyo;

// Nama           : Ilham Prasetyo
// NIM            : 10116496
// Kelas          : AKB-11
// Tgl Pengerjaan : 18 April 2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btn_Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, AThereActivity.class);
                startActivity(i);
            }
        });

    }
}
