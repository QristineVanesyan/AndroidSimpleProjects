package com.example.gumarumhanum;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private EditText sign;
    private TextView equal;
    private TextView result;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        sign = (EditText)findViewById(R.id.sign);
        equal = (TextView) findViewById(R.id.equal);
        result = (TextView) findViewById(R.id.result);
        button = (Button) findViewById(R.id.button);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = number1.getText().toString();
                String str2 = number2.getText().toString();

                String sign1 = sign.getText().toString();
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                int res;
               // if((str1.isEmpty())||(str2.isEmpty())||(sign1.isEmpty())){
                switch(sign1) {
                    case "+":
                        res=num1+num2;
                        result.setText(res+"");
                        break;
                    case "-":
                        res=num1-num2;
                        result.setText(res+"");
                        break;
                    case "/":
                        res=num1/num2;
                        result.setText(res+"");
                        break;
                    case "*":
                        res=num1*num2;
                        result.setText(res+"");
                        break;
                    default:
                        result.setText("Wrong Input");
                        break;
                }}
            //}
        };
        button.setOnClickListener(clickListener);
    }
}