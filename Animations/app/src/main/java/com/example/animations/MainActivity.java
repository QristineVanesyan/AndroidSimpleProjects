package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private TextView res;
    private EditText edit;
    private Button button;
    private int n1;
    private int n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.res);
        edit = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.button);

        final Animation animationForCorrect = AnimationUtils.loadAnimation(this,R.anim.right) ;
        final Animation animationForIncorrect = AnimationUtils.loadAnimation(this,R.anim.left) ;

        Generate generate = new Generate();
        n1 = generate.getNum1();
        n2 = generate.getNum2();
        num1.setText(n1+"");
        num2.setText(n2+"");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(edit.getText().toString());
                if (n1 + n2 == result) {
                    res.setText("correct");
                    res.setTextColor(Color.GREEN);
                    res.startAnimation(animationForCorrect);
                } else {
                    res.setText("incorrect");
                    res.setTextColor(Color.RED);
                    res.startAnimation(animationForIncorrect);
                }
            }
        };
        button.setOnClickListener(onClickListener);


    }
}