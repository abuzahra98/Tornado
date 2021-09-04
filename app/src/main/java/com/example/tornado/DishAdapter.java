package com.example.tornado;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class DishAdapter extends  RecyclerView.Adapter<DishAdapter.dishHolder> {
//set the data from this list to bind in the fragment
    List<Dish> allDish = new ArrayList<>();

        //    constructor
    public DishAdapter (List<Dish> allDish){
        this.allDish = allDish;
    }

    public  static class dishHolder extends RecyclerView.ViewHolder{
        //        Dish object
        public Dish dish;

        //        View object

        View itemView;
        public dishHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

        //   listener to open  details page for all single dish
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), ditial.class);
                    i.putExtra("name",dish.name);
                    i.putExtra("price",dish.price);
                    i.putExtra("ing",dish.ing);

                    v.getContext().startActivity(i);
                }
            });
        }

    }
    @NonNull
    @Override
    public dishHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
         //create view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dish, parent, false);
        dishHolder dishhold = new dishHolder(view);
        return dishhold;
    }
    @Override
    public void onBindViewHolder(@NonNull dishHolder dishHolder, int position) {


        dishHolder.dish = allDish.get(position);
                TextView name = dishHolder.itemView.findViewById(R.id.name);
                TextView price = dishHolder.itemView.findViewById(R.id.price);
                name.setText(dishHolder.dish.name);
                price.setText(dishHolder.dish.price);

    }

    @Override
    public int getItemCount() {
        return allDish.size();
    }
}


