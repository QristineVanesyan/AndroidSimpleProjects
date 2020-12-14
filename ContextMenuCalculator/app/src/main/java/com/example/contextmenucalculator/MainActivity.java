package com.example.contextmenucalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.indexOf;
import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private TextView sign;
    private EditText number1;
    private EditText number2;
    private Button button;
    private char signForFunc=' ';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        sign = (TextView)findViewById(R.id.sign);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        button = (Button) findViewById(R.id.button);
        registerForContextMenu(sign);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                Calulator calulator = new Calulator(n1,n2,signForFunc);
                String res=calulator.solve()+"";
                result.setText(res);
            }
        };
        button.setOnClickListener(clickListener);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId()==R.id.sign) {
            menu.add(0, 0, 0, "+");
            menu.add(1, 1, 1, "-");
            menu.add(2, 2, 2, "/");
            menu.add(3, 3, 3, "*");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==0)
        {
            sign.setText("+");
            signForFunc='+';
        }
        else if(item.getItemId()==1)
        {
            sign.setText("-");
            signForFunc='-';
        }
        else if(item.getItemId()==2)
        {
            sign.setText("/");
            signForFunc='/';
        }
        else
        {
            sign.setText("*");
            signForFunc='*';
        }
        return super.onContextItemSelected(item);
    }
}