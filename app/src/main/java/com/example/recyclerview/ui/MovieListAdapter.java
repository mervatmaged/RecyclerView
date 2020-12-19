package com.example.recyclerview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.pojo.MovieModle;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {
    private ArrayList<MovieModle> moviList = new ArrayList<>();

    @NonNull
    @Override
    public MovieListAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movi_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapter.MovieViewHolder holder, int position) {
    holder.movieNameTV.setText(moviList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return moviList.size();
    }

    public void setList(ArrayList<MovieModle>moviList){
        this.moviList = moviList;
        notifyDataSetChanged();
    }
    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView movieNameTV;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieNameTV = itemView.findViewById(R.id.movie_name_tv);
        }
    }

}
