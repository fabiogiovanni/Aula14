package com.example.giova.arqdesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class Cursos extends AppCompatActivity {
    private EditText nome;
    public static final String CHAVE = "com.example.giova.arqdesis.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        nome = (EditText)findViewById(R.id.busca_curso);
    }
    public void buscarCursos(View view){
        Intent intent = new Intent(this, ListaCursosActivity.class);
        String chave = nome.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}


