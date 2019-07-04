package com.example.simpletodo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lvItems = (ListView) findViewById(R.id.listview);
        lvItems.setAdapter(itemsAdapter);

        // mock data
        items.add("First item");
        items.add("Second item");
        setupListViewListener();
    }

    public void onAddItem(View v) {
        EditText etNewItem = (EditText) findViewById(R.id.edit_text1);
        String itemText = etNewItem.getText().toString();
        itemsAdapter.add(itemText);
        etNewItem.setText("");
        Toast.makeText(getApplicationContext(), " Item added to list", Toast.LENGTH_SHORT).show();
    }

    private void setupListViewListener() {
        {
            Log.i("Mainactivity", "Setting up listener on list view");
            lvItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {


                @Override
                public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

               @Override
               public boolean onItemLongClick(AdapterView<?>)
                }
            });

        }
    }

}











