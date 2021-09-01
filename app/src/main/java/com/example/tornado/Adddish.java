package com.example.tornado;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Adddish extends AppCompatActivity {
    AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddish);

//save in data base
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText name = findViewById(R.id.dishname);
        final EditText price = findViewById(R.id.dishprice);
        final EditText ing = findViewById(R.id.ing);
//submit button
        Button first = findViewById(R.id.submit);
        first.setOnClickListener(new  View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Dish dish = new Dish(name.getText().toString(),price.getText().toString(),  ing.getText().toString());
                appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"Dish").allowMainThreadQueries().build();

                DishDao dishDao = appDatabase.dishDao();
                // save to db

                dishDao.insertAll(dish);


                Toast.makeText(getApplicationContext(),"add!",Toast.LENGTH_LONG).show();
            }
        });

    }
}
