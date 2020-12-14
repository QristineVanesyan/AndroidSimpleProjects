package com.example.openpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {
    private EditText password;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText) findViewById(R.id.password);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        View.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String string = password.getText().toString();
                if(!isEmpty(string)) {
                    textView.setText(string);
                }
                else
                {
                    textView.setText("");
                }
            }
        };
        button.setOnClickListener(clickListener);
    }
}