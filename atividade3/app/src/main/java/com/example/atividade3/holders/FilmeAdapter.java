package com.example.atividade3.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividade3.R;
import com.example.atividade3.models.Filme;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>{
    private List<Filme> filmes;
    private Context context;

    public FilmeAdapter(Context context, List<Filme> filmes){
        this.context = context;
        this.filmes = filmes;
    }
    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filme, parent, false);
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {
        Filme filme = filmes.get(position);
        holder.tituloTextView.setText(filme.getTitulo());
        holder.anoTextView.setText(String.valueOf(filme.getAno()));
        holder.diretorTextView.setText(filme.getDiretor());
        holder.posterImageView.setImageResource(filme.getImagem());

        holder.sinopseButton.setOnClickListener(v -> {
            Toast.makeText(context, filme.getSinopse(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public static class FilmeViewHolder extends RecyclerView.ViewHolder {
        TextView tituloTextView, anoTextView, diretorTextView;
        ImageView posterImageView;
        Button sinopseButton;

        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);
            sinopseButton = itemView.findViewById(R.id.sinopseButton);
            tituloTextView = itemView.findViewById(R.id.tituloTextView);
            anoTextView = itemView.findViewById(R.id.anoTextView);
            diretorTextView = itemView.findViewById(R.id.diretorTextView);
            posterImageView = itemView.findViewById(R.id.posterImageView);
        }
    }
}
