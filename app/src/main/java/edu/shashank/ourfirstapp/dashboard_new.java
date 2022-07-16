package edu.shashank.ourfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Map;

public class dashboard_new extends AppCompatActivity {

    FloatingActionButton addButton;
    ListView listView;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_new);

        ArrayList list = new ArrayList();
        SharedPreferences preferences = getSharedPreferences("myNotes", Context.MODE_PRIVATE);
        Map<String, String> itemsMap = (Map<String, String>) preferences.getAll();

        itemsMap.forEach((key, value) -> {
            list.add(value);
        });

        listView = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.array_adapter_view, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), NewNote.class);
                intent.putExtra("hasNote", true);

                TextView text = (TextView)view;
                intent.putExtra("noteText", text.getText());

                startActivity(intent);
            }
        });

        addButton = findViewById(R.id.addNoteButton);

        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NewNote.class);
                startActivity(intent);
            }
        });
    }
}