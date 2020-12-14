package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView student;
    private Button sortByName;
    private Button sortByAvg;
    private StudentGroup studentGroup = new StudentGroup();
    private StudentGroup likvistudentGroup = new StudentGroup();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student = (TextView) findViewById(R.id.student);
        sortByAvg = (Button) findViewById(R.id.sortAvg);
        sortByName = (Button) findViewById(R.id.sortName);

        studentGroup.fillStudents();
        studentGroup.getLikvidStudentArray();
        System.out.println(studentGroup.getStudents());
        for (int i = 0; i <studentGroup.getStudents().size() ; i++) {
            if(studentGroup.getStudents().get(i).isLikvid())
            {
                student.setText("" + studentGroup.getStudents().get(i).toString()+"\n");
                student.setTextColor(Color.RED);
            }
            else
            {
                student.setText("" + studentGroup.getStudents().get(i).toString()+"\n");
                student.setTextColor(Color.BLACK);
            }
        }
       /*---*/
        View.OnClickListener clickListener2 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                studentGroup.sortByAvg();
                String res = studentGroup.printStudents();
                student.setText(res);
            }
        };
        sortByAvg.setOnClickListener(clickListener2);
        View.OnClickListener clickListener1 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                studentGroup.sortByName();
                String res = studentGroup.printStudents();
                student.setText(res);
            }
        };
        sortByName.setOnClickListener(clickListener1);

    }
}