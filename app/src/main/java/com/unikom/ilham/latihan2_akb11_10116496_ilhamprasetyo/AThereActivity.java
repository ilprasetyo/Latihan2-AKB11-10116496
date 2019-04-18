package com.unikom.ilham.latihan2_akb11_10116496_ilhamprasetyo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AThereActivity extends AppCompatActivity {

    Button athere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athere);

        athere = (Button) findViewById(R.id.athere);
        athere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AThereActivity.this, VerifyActivity.class);
                startActivity(i);
            }
        });
    }
}
