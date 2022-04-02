package edu.shashank.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Student student1 = new Student();
        TextView view = findViewById(R.id.textView7);
        student1.name = "Ishita";
        student1.setFatherName("Shashank Bansal");
        String fatherName = student1.getFatherName();
        view.setText(student1.add((float)10.5,(float)20.10) + "");
    }
}