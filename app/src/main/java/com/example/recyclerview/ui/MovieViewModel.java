package com.example.recyclerview.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.recyclerview.pojo.MovieModle;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel {

    public MutableLiveData<ArrayList<MovieModle>> movieNameMutableLiveData = new MutableLiveData<>();
    public void getMovieName(){

        movieNameMutableLiveData.setValue(getMovieFromDatabase());
    }

    private ArrayList<MovieModle> getMovieFromDatabase() {
        ArrayList<MovieModle> arrayList = new ArrayList<>() ;
        arrayList.add(new MovieModle("The Call","2020","Mysterious Movie",100));
        arrayList.add(new MovieModle("Bueaty And THe Beast","2017","Wandr Full Movie",102));
        arrayList.add(new MovieModle("Mullan","2020","Great Movie",103));
        arrayList.add(new MovieModle("Hotel Transylvania","2012","Cartoon Movie",104));
        arrayList.add(new MovieModle("Hello Worled","2020","Animation Movie",105));
        arrayList.add(new MovieModle("The Lion King","2011","Cartoon Movie",106));
        arrayList.add(new MovieModle("cinderella","210","Cartoon Movie",107));
        arrayList.add(new MovieModle("Snow Wite","2020","Cartoon Movie",108));
        arrayList.add(new MovieModle("Dud Inside Me","2020","Korean Movie",109));
        return arrayList;

    }
}
