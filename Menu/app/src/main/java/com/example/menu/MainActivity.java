package com.example.menu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"menu 0");
        menu.add(0,1,1,"menu 1");
        menu.add(0,2,2,"menu 2");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id)
        {
            case 0:
                Toast.makeText(this,"you click on menu "+id,Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(this,"you click on menu "+id,Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"you click on menu "+id,Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}