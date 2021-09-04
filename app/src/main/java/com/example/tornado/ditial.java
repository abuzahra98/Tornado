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

        // get the intent to get the data that sent from menu activity
        // get all the textView to render the data inside
        Intent intents = getIntent();
        String dishs = intents.getExtras().getString("ing");
        TextView dishing = findViewById(R.id.ing);
        // set the data in the views
        dishing.setText(dishs);

        // get the intent to get the data that sent from menu activity
        // get all the textView to render the data inside
        Intent intent = getIntent();
        String price = intent.getExtras().getString("price");
        TextView prices = findViewById(R.id.price);
        // set the data in the views
        prices.setText(price);

        // get the intent to get the data that sent from menu activity
        // get all the textView to render the data inside
        Intent intent1 = getIntent();
        String ditial = intent1.getExtras().getString("name");
        TextView ditials = findViewById(R.id.ditial);
        // set the data in the views
        ditials.setText(ditial);



    }
}
