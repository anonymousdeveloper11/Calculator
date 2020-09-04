package com.example.dangicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtFirst, edtSecond;
    TextView calResult;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirst =findViewById(R.id.edtFirst);
        edtSecond =findViewById(R.id.edtSecond);
        calResult =findViewById(R.id.calResult);
        add =findViewById(R.id.btnAdd);
        sub =findViewById(R.id.btnSub);
        mul =findViewById(R.id.btnMul);
        div =findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(edtFirst.getText().toString());
                secondValue = Integer.parseInt(edtSecond.getText().toString());

                ans = firstValue + secondValue;

                calResult.setText("Result = " +ans);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(edtFirst.getText().toString());
                secondValue = Integer.parseInt(edtSecond.getText().toString());

                ans = firstValue - secondValue;

                calResult.setText("Result = " +ans);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(edtFirst.getText().toString());
                secondValue = Integer.parseInt(edtSecond.getText().toString());

                ans = firstValue * secondValue;

                calResult.setText("Result = " +ans);

            }
        });

       div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue, secondValue, ans;

                firstValue= Integer.parseInt(edtFirst.getText().toString());
                secondValue = Integer.parseInt(edtSecond.getText().toString());

                ans = firstValue /



                        secondValue;

                calResult.setText("Result = " +ans);

            }
        });

    }

}