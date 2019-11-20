package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> items;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    Button buttonInsert;
    Button buttonRemove;
    EditText editTextInsert;
    EditText editTextRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInsert = findViewById(R.id.button_insert);
        buttonRemove = findViewById(R.id.button_remove);

        editTextInsert = findViewById(R.id.edittext_insert);
        editTextRemove = findViewById(R.id.edittext_remove);

        setList();
        setRecyclerView();

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextInsert.getText().toString();
                if (isValidNumber(value)){
                    int position = Integer.parseInt(editTextInsert.getText().toString());
                    insertItem(position);
                }
            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextRemove.getText().toString();
                if (isValidNumber(value)){
                    int position = Integer.parseInt(editTextRemove.getText().toString());
                    removeItem(position);
                }
            }
        });
    }

    public void insertItem(int position){
        items.add(position, new Item(R.drawable.ic_apps, "New Item At Position " + position, "Line 2"));
        adapter.notifyItemInserted(position);
    }

    public void removeItem(int position){
        items.remove(position);
        adapter.notifyItemRemoved(position);
    }

    public void setRecyclerView(){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ItemAdapter(items);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void setList(){
        items = new ArrayList<>();
        items.add(new Item(R.drawable.ic_android, "Line 1", "Line 2"));
        items.add(new Item(R.drawable.ic_apps, "Line 1", "Line 2"));
        items.add(new Item(R.drawable.ic_folder, "Line 1", "Line 2"));
    }

    public boolean isValidNumber(String s){
        if (s.isEmpty()) {
            Toast.makeText(MainActivity.this, "Make Sure Value Is Set", Toast.LENGTH_SHORT).show();
            return false;
        }
        try {
            int position = Integer.parseInt(s);
            if (position > items.size()) {
                Toast.makeText(MainActivity.this, "Invalid Value", Toast.LENGTH_SHORT).show();
                return false;
            }
        } catch (Exception e){
            Toast.makeText(MainActivity.this, "Something Happened", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
