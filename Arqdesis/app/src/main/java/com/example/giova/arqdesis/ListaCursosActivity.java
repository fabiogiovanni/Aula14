package com.example.giova.arqdesis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaCursosActivity extends AppCompatActivity {
    public static final String NOME = "com.example.giova.arqdesis.chave.nome";
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(Cursos.CHAVE);
        lista = buscaCursos(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalhesCursoActivity.class);
                intent.putExtra(NOME, lista.get(position));
                startActivity(intent);
            }
        });
    }

    public ArrayList<String> buscaCursos(String chave) {
        ArrayList<String> lista = geraListaCursos();
        if (chave == null || chave.length() == 0) {
            return lista;
        } else {
            ArrayList<String> subLista = new ArrayList<>();
            for (String nome : lista) {
                if (nome.toUpperCase().contains(chave.toUpperCase())) {
                    subLista.add(nome);
                }
            }
            return subLista;
        }
    }

    public ArrayList<String> geraListaCursos() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Informatica");
        lista.add("Artes");
        return lista;
    }
}

