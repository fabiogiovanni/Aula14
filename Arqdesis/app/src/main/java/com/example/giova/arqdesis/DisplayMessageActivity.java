package com.example.giova.arqdesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String cursos[] = {"Artes", "Informatica"};
        ListView listaDeCursos = (ListView) findViewById(R.id.listaCursos);
        ArrayAdapter<String> adaptaListaDeCursos = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cursos);
        listaDeCursos.setAdapter(adaptaListaDeCursos);
    }
}
