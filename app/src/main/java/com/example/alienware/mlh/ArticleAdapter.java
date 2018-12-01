package com.example.alienware.mlh;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private List<Article> articles;

    ArticleAdapter(@NonNull List<Article> articles){
        this.articles = articles;
    }
    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder articleViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void onClick(View view) {

    }
}