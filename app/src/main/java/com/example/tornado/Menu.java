package com.example.tornado;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Menu extends AppCompatActivity {
    AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"Dish").allowMainThreadQueries().build();
        List<Dish> dishList = appDatabase.dishDao().getAll();
        RecyclerView allDishs = findViewById(R.id.ss);
        allDishs.setLayoutManager(new LinearLayoutManager(this));
        allDishs.setAdapter(new DishAdapter(dishList));

    }
}
