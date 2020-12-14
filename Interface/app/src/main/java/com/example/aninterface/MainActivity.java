package com.example.aninterface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ArrayList<Shape> shapeArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        Count count = new Count();
        shapeArrayList = count.createShapes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "area");
        menu.add(1, 1, 1, "perimeter");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 0) {
            String areas = "";
            for (int i = 0; i < shapeArrayList.size(); i++) {
                areas += shapeArrayList.get(i).S() + "\n";
            }
            textView.setText(areas);
        } else {
            String perimeters = "";
            for (int i = 0; i < shapeArrayList.size(); i++) {
                perimeters += shapeArrayList.get(i).P() + "\n";
            }
            textView.setText(perimeters);
        }
        return super.onOptionsItemSelected(item);
    }
}