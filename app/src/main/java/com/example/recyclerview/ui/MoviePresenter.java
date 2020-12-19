package com.example.recyclerview.ui;

import com.example.recyclerview.pojo.MovieModle;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public void getMovieName(){
    //    view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
