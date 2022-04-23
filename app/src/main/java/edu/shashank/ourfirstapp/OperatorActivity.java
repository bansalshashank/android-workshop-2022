package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class OperatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);

//    Declaring EditText
        EditText text1 = findViewById(R.id.firstValue);
        EditText text2 = findViewById(R.id.secondValue);

//        Declaring Button
        Button submitButton = findViewById(R.id.submitButton);

//        Declaring TextView
        TextView result = findViewById(R.id.result);

//        Declaring button listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sum  = Integer.parseInt(text1.getText() + "") + Integer.parseInt(text2.getText() + "") + "";
                Toast.makeText(
                        view.getContext(),
                        sum,
                        Toast.LENGTH_LONG
                ).show();
                result.setText(sum);
            }
        });


    }
}