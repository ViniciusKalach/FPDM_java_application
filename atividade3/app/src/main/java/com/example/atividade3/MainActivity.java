package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.atividade3.holders.FilmeAdapter;
import com.example.atividade3.models.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FilmeAdapter adapter;
    private List<Filme> filmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        filmes = getFilmes(); // Aqui você pode obter os filmes de onde preferir

        adapter = new FilmeAdapter(this, filmes);
        recyclerView.setAdapter(adapter);
    }

    private List<Filme> getFilmes() {
        // Aqui você pode criar uma array com os filmes ou obter do Firestore
        // Exemplo com uma array:
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("A Ilha do Medo", 2010, "Sinopse de A Ilha do Medo", "Martin Scorsese", R.mipmap.filme1));
        filmes.add(new Filme("Rocky: Um lutador", 1976, "Sinopse de Rocky: Um lutador", "John G. Avildsen", R.mipmap.filme2));
        filmes.add(new Filme("Senhor dos Anéis: O retorno do Rei", 2002, "Sinopse de Senhor dos Anéis: O retorno do Rei", "Peter Jackson", R.mipmap.filme3));
        return filmes;
    }
}
