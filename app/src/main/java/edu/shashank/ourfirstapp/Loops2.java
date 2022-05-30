package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Loops2 extends AppCompatActivity {

    TextView counterText;
    Button counterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loops);

        counterText = findViewById(R.id.textCounter);
        counterButton = findViewById(R.id.counterButton);

        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * Loops: To repeat the code until the condition is false
                * for: for( initial value; condition; increment/decrement)
                * while: while( condition )
                * */

                int counter = 0;

                /*
                * Similar ways of writing:
                * counter = counter + 2 -> increments the value of counter by 2
                * counter += 2 -> increments the value of the country by 2
                * counter++ -> increments the value by 1
                * */

                int array[] = { 10,20,43,54,65,76,87,98,59,410,1234,234 };
//                array[0] 10
//                array[1] 20
//                array[2] 43
                for( counter = 0; counter < array.length; counter++ ) {
                    int result = Integer.parseInt(counterText.getText().toString()) + array[counter];
                    counterText.setText(result + "");
                }

                while( counter < array.length ) {
                    int result = Integer.parseInt(counterText.getText().toString()) + array[counter];
                    counterText.setText(result + "");
                    counter++;
                }
            }
        });
    }
}