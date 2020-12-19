package com.example.recyclerview.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.recyclerview.R;
import com.example.recyclerview.databinding.ActivityMainBinding;
import com.example.recyclerview.pojo.MovieModle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        MovieListAdapter adapter = new MovieListAdapter();
        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<ArrayList<MovieModle>>() {
            @Override
            public void onChanged(ArrayList<MovieModle> movieModles) {
                adapter.setList(movieModles);
            }
        });
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.setLifecycleOwner(this);





    }
}
