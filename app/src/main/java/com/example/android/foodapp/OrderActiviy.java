package com.example.android.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.android.foodapp.Adapters.OrdersAdapter;
import com.example.android.foodapp.Models.OrdersModel;
import com.example.android.foodapp.databinding.ActivityOrderActiviyBinding;

import java.util.ArrayList;

public class OrderActiviy extends AppCompatActivity {
    ActivityOrderActiviyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderActiviyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        DBHelper helper=new DBHelper(this);
        ArrayList<OrdersModel> list=helper.getOrders();

        OrdersAdapter adapter=new OrdersAdapter(list,this);
        binding.ordersRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);

    }
}