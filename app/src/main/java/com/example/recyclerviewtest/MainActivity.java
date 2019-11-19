package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(R.drawable.ic_android, "Line 1", "Line 2"));
        items.add(new Item(R.drawable.ic_apps, "Line 1", "Line 2"));
        items.add(new Item(R.drawable.ic_folder, "Line 1", "Line 2"));
    }
}
