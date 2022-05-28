package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator2);

        text1 = findViewById(R.id.input1);
        text2 = findViewById(R.id.input2);

        resultView = findViewById(R.id.resultTextView);

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


        int result = 0;

//        Conditional Statements:
//        If else, Switch

//        loops
//        for, while, foreach, do-while

        try {
            int value1 = Integer.parseInt(text1.getText().toString());
            int value2 = Integer.parseInt(text2.getText().toString());

            result =  value1 + value2;


            if(value1 == 1) {
                resultView.setText(R.string.monday);
                Toast.makeText(view.getContext(), "Monday", Toast.LENGTH_SHORT).show();
            }else if(value1 == 2) {
                resultView.setText(R.string.tuesday);
                Toast.makeText(view.getContext(), "Tuesday", Toast.LENGTH_SHORT).show();
            }else if(value1 == 3) {
                resultView.setText(R.string.wednesday);
                Toast.makeText(view.getContext(), "Wednesday", Toast.LENGTH_SHORT).show();
            }else if(value1 == 4) {
                resultView.setText(R.string.thursday);
                Toast.makeText(view.getContext(), "Thursday", Toast.LENGTH_SHORT).show();
            }else if(value1 == 5) {
                resultView.setText(R.string.friday);
                Toast.makeText(view.getContext(), "Friday", Toast.LENGTH_SHORT).show();
            }else if(value1 == 6) {
                resultView.setText(R.string.saturday);
                Toast.makeText(view.getContext(), "Saturday", Toast.LENGTH_SHORT).show();
            }else if((value1 == 7) || (value1==8) || (value1==8)) {
                resultView.setText(R.string.sunday);
                Toast.makeText(view.getContext(), "Sunday", Toast.LENGTH_SHORT).show();
            }else {
                modulus.setText(R.string.monday);
                Toast.makeText(view.getContext(), "Input a valid DOW", Toast.LENGTH_SHORT).show();
            }

            resultView.setText(R.string.invalidDay);

//            if((result >= 100) || (result <= 150)) {
//                resultView.setText("Value as expected");
//                Toast.makeText(view.getContext(), "Value as expected", Toast.LENGTH_SHORT).show();
//            }else {
//                Toast.makeText(view.getContext(), "Value not as expected", Toast.LENGTH_SHORT).show();
//            }




//    switch(value1) {
//        case 1:
//            result = "Monday";
//            break;
//        case 2:
//            result = "Tuesday";
//            break;
//        case 3:
//            result = "Wednesday";
//            break;
//        case 4:
//            result = "Thursday";
//            break;
//        case 5:
//            result = "Friday";
//            break;
//        case 6:
//            result = "Saturday";
//            break;
//        case 7:
//            result = "Sunday";
//            break;
//        default:
//            result = "Input a valid DOW";
//    }

//    Toast.makeText(view.getContext().getApplicationContext(), result, Toast.LENGTH_SHORT).show();






/**            Conditional Operator:
 *  == -> Equal To : (10 == 20) -> false
 *  != -> Not equal to: (10 != 20) -> true
 *  < -> less than
 *  > ->  greater than
 *  <= ->  less than equal to
 *  >= -> greater than equal to
 *  && -> AND Operator
 *  || -> OR Operator
 *
   **/





//            switch (view.getId()) {
//                case R.id.sum:
//                    result = value1 + value2;
//                    break;
//                case R.id.subtract:
//                    result = value1 - value2;
//                    break;
//                case R.id.multiply:
//                    result = value1 * value2;
//                    break;
//                case R.id.divide:
//                    result = (float) value1 / value2;
//                    break;
//                case R.id.mod:
//                    result = value1 % value2;
//                    break;
//                default:
//                    result = 0;
//            }
        }
//        catch(NumberFormatException e){
//            Toast.makeText(view.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
//        }
        catch(Exception e){
            Toast.makeText(view.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
//            Toast.makeText(view.getContext(), result + "", Toast.LENGTH_SHORT).show();
        }

    }
}

// Recursion

