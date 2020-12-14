package com.example.contextmenucolorshift;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView color;
    private TextView font;
    private Button hide;
    private Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = (TextView) findViewById(R.id.color);
        font = (TextView) findViewById(R.id.font);
        hide = (Button) findViewById(R.id.hide);
        show = (Button) findViewById(R.id.show);
        registerForContextMenu(color);
        registerForContextMenu(font);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color.setVisibility(View.VISIBLE);
                font.setVisibility(View.VISIBLE);
            }
        };
        show.setOnClickListener(clickListener);
        View.OnClickListener clickListener1 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                color.setVisibility(View.GONE);
                font.setVisibility(View.GONE);
            }
        };
        hide.setOnClickListener(clickListener1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() == R.id.color) {
            menu.add(0, 0, 0, "RED");
            menu.add(1, 1, 1, "GREEN");
        }
        if (v.getId() == R.id.font) {
            menu.add(0, 2, 0, "18");
            menu.add(1, 3, 1, "20");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 0) {
            color.setBackgroundColor(Color.RED);
        } else if (item.getItemId() == 1) {
            color.setBackgroundColor(Color.GREEN);
        } else if (item.getItemId() == 2) {
            font.setTextSize(18);
        } else {
            font.setTextSize(20);
        }
        return super.onContextItemSelected(item);
    }
}