package com.example.tornado;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity

public class Dish {
    // Dish  model class
        @PrimaryKey(autoGenerate = true)
        public int idDish;

        @ColumnInfo(name= "Dish_name")
        public  String name;

        @ColumnInfo  (name= "Dish_price")
        public  String price;

        @ColumnInfo  (name= "Dish_ing")
        public String ing;

        public Dish(String name, String price , String ing) {
            this.name = name;
            this.price = price;
            this.ing = ing;
        }

    }
