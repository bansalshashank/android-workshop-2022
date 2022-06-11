package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intent1 extends AppCompatActivity {

    Button intentButton;
    EditText  textBox, textbox1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        intentButton = findViewById(R.id.intent1button);
        textBox = findViewById(R.id.intent1TextBox);
        textbox1 = findViewById(R.id.intent1Textbox2);

        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext() , Intent2.class );
                intent.putExtra("text", textBox.getText().toString());
                intent.putExtra("text1", textbox1.getText().toString());

                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textBox.setText("");
        textbox1.setText("");
    }
}