package com.example.imageaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private EditText number1;
    private EditText number2;
    private Button button;
    private ArrayList<ImageView> imageViews = new ArrayList<ImageView>();
    private ArrayList<Integer> imageViewIDs = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);
        image3 = (ImageView)findViewById(R.id.image3);
        image4 = (ImageView)findViewById(R.id.image4);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        button = (Button)findViewById(R.id.button);

        image1.setImageResource(R.drawable.a);
        image2.setImageResource(R.drawable.b);
        image3.setImageResource(R.drawable.c);
        image4.setImageResource(R.drawable.d);

        imageViews.add(image1);
        imageViews.add(image2);
        imageViews.add(image3);
        imageViews.add(image4);

        imageViewIDs.add(R.drawable.a);
        imageViewIDs.add(R.drawable.b);
        imageViewIDs.add(R.drawable.c);
        imageViewIDs.add(R.drawable.d);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageNumber1 = Integer.parseInt(number1.getText().toString())-1;
                int imageNumber2 = Integer.parseInt(number2.getText().toString())-1;
                if(imageNumber1>=0&&imageNumber1<=3&&imageNumber2>=0&&imageNumber2<=3) {
                    Collections.swap(imageViewIDs, imageNumber1, imageNumber2);
                    for (int i = 0; i < imageViews.size(); i++) {
                        imageViews.get(i).setImageResource(imageViewIDs.get(i));
                    }
                }
            }
        };
        button.setOnClickListener(onClickListener);
    }

}