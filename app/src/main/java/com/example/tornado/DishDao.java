package com.example.tornado;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

// DishDao and the methods the app uses to interact with database
@Dao
public interface DishDao {

    @Query("SELECT * FROM dish")
    List<Dish> getAll();

    @Insert
    void insertAll(Dish...dishes);

    @Delete
    void delete(Dish...dish);
}
