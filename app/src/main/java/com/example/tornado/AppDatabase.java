package com.example.tornado;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
// AppDatabase class to hold the database
@Database(entities = {Dish.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DishDao dishDao();
}
