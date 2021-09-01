package com.example.tornado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ditial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ditial);


        Intent intents = getIntent();
        String dishs = intents.getExtras().getString("ing");
        TextView dishing = findViewById(R.id.ing);
        dishing.setText(dishs);

    }
}
