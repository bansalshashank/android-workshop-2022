package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Loops extends AppCompatActivity  {
/*
* For loop - for(initial value; condition; incrementor/decrementor)
* While loop - while(condition)
* */

    Button counterButton;
    TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loops);

        counterButton = findViewById(R.id.counterButton);
        counterText = findViewById(R.id.textCounter);

        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              For loop - for(initial value; condition; incrementor/decrementor)
                int counter = 0;
//                for( counter = 10; counter >= 0; counter-- ) {
//                    Toast.makeText(view.getContext(), counter + "", Toast.LENGTH_SHORT).show();
//                    counterText.setText(counterText.getText().toString()+" "+ counter + "");
//                }

//                While loop - while(condition)

                while( counter <= 10 ) {
                    Toast.makeText(view.getContext(), counter + "", Toast.LENGTH_SHORT).show();
                    counter++;
                }
            }
        });
    }

}