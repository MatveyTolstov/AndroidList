package com.example.recycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Cat> cats;
    private final Context context;

    public CatAdapter(Context context, List<Cat> cats) {
        this.cats = cats;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public CatAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.ViewHolder holder, int position) {
        Cat cat = cats.get(position);
        holder.catview.setImageResource(cat.getCatResource());
        holder.nameView.setText(cat.getName());
        holder.haracterView.setText(cat.getHaracter());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", cat.getName());
            intent.putExtra("character", cat.getHaracter());
            intent.putExtra("image", cat.getCatResource());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView catview;
        final TextView nameView, haracterView;

        ViewHolder(View view) {
            super(view);
            catview = view.findViewById(R.id.cat);
            nameView = view.findViewById(R.id.name);
            haracterView = view.findViewById(R.id.haracter);
        }
    }
}
