package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Operator2 extends AppCompatActivity implements View.OnClickListener {

    //      Declare our layout variables

    EditText text1;
    EditText text2;

    Button sum;
    Button subtract;
    Button multiply;
    Button divide;
    Button modulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator2);

        text1 = findViewById(R.id.input1);
        text2 = findViewById(R.id.input2);

        sum = findViewById(R.id.sum);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        modulus = findViewById(R.id.mod);

        sum.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        modulus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int value1 = Integer.parseInt(text1.getText().toString());
        int value2 = Integer.parseInt(text2.getText().toString());

        float result = 0;

//        Conditional Statements:
//        If else, Switch

//        loops
//        for, while, foreach, do-while


        switch (view.getId()) {
            case R.id.sum:
                result = value1 + value2;
                break;
            case R.id.subtract:
                result = value1 - value2;
                break;
            case R.id.multiply:
                result = value1 * value2;
                break;
            case R.id.divide:
                result = (float) value1 / value2;
                break;
            case R.id.mod:
                result = value1 % value2;
                break;
            default:
                result = 0;
        }

        Toast.makeText(view.getContext(), result + "", Toast.LENGTH_SHORT).show();
    }
}

// Recursion



