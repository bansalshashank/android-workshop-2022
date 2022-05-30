package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intent1 extends AppCompatActivity {

    Button intentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        intentButton = findViewById(R.id.intent1button);

        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext() , Intent2.class );
                startActivity(intent);
            }
        });

    }
}