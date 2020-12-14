package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 1, "Random name");
        menu.add(1, 2, 2, "Red");
        menu.add(1, 3, 3, "Green");
        menu.add(2, 4, 4, "Big");
        menu.add(2, 5, 5, "Small");
        menu.add(3, 6, 6, "Reverse");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == 1) {
            String[] arr = {"Ani", "Mariam", "Marina", "Qristina"};
            int randomNum = (int) (Math.random() * 4);
            name = arr[randomNum];
            textView.setText(name);
        } else if (item.getItemId() == 2) {
            textView.setTextColor(Color.RED);
        } else if (item.getItemId() == 3) {
            textView.setTextColor(Color.GREEN);
        } else if (item.getItemId() == 4) {
            textView.setTextSize(18);
        } else if (item.getItemId() == 5) {
            textView.setTextSize(10);
        } else {
            StringBuffer reversedString = new StringBuffer(name);
            reversedString.reverse();
            textView.setText(reversedString);
        }
        return super.onOptionsItemSelected(item);
    }
}