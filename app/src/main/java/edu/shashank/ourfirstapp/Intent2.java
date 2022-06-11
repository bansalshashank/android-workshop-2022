package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {

    TextView text,text1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        button = findViewById(R.id.intent2button);
        text = findViewById(R.id.intent2Text);
        text1 = findViewById(R.id.intent2textbox2);

        String intentValue = getIntent().getExtras().getString("text");
        String intentValue1 = getIntent().getExtras().getString("text1");

        text.setText(intentValue);
        text1.setText(intentValue1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Intent1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}