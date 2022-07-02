package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class NewNote extends AppCompatActivity {

//    File System.
//    Database - Not use it.
//    Shared Preferences -

    SharedPreferences preferences;

    Button addButton;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        addButton = findViewById(R.id.addNewNoteButton);
        text = findViewById(R.id.newNoteText);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = text.getText().toString();

                SharedPreferences preferences = getSharedPreferences("myNotes", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                String date= new Date().getTime() + "";

                editor.putString(date , value);
                editor.apply();


                Toast.makeText(NewNote.this, preferences.getString(date, "not found"), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(NewNote.this, dashboard_new.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });




    }
}