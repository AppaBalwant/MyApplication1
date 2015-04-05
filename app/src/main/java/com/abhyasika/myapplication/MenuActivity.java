package com.abhyasika.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Ramesh Patwardhan on 04 April 2015 at 2:42 PM.
 */
public class MenuActivity extends ListActivity {
    String classes[] = {"MainActivity", "TextPlay", "example2", "example3", "example4", "example5", "example6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MenuActivity.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
       // Class ourClass = null;
        try {
            Class ourClass = Class.forName("com.abhyasika.myapplication." + cheese);
            Intent ourIntent = new Intent(MenuActivity.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
