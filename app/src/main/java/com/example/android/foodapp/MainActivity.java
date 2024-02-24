package com.example.android.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.android.foodapp.Adapters.MainAdapter;
import com.example.android.foodapp.Models.MainModel;
import com.example.android.foodapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","5","Chicken Burger with Extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","0","The offer to download the coupons ends Thursday May 28"));
        list.add(new MainModel(R.drawable.por,"Portobello Mushroom","12","Meaty portobello mushroom make for the perfect vegetarian burger!"));
        list.add(new MainModel(R.drawable.boc,"Pizza Burger","10","Burger O'clock is available to satiate your hunger"));
        list.add(new MainModel(R.drawable.burger,"Burger","5","Chicken Burger with Extra cheese"));
        list.add(new MainModel(R.drawable.por,"Portobello Mushroom","12","Meaty portobello mushroom make for the perfect vegetarian burger!"));
        list.add(new MainModel(R.drawable.por,"Portobello Mushroom","12","Meaty portobello mushroom make for the perfect vegetarian burger!"));
        list.add(new MainModel(R.drawable.por,"Portobello Mushroom","12","Meaty portobello mushroom make for the perfect vegetarian burger!"));
        list.add(new MainModel(R.drawable.por,"Portobello Mushroom","12","Meaty portobello mushroom make for the perfect vegetarian burger!"));
        MainAdapter adapter =new MainAdapter(list,this);
        binding.recylerview.setAdapter(adapter);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActiviy.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}