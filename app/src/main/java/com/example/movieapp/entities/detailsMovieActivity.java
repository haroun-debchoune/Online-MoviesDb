package com.example.movieapp.entities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.movieapp.R;
import com.example.movieapp.databinding.ActivityDetailsMovieBinding;
import com.example.movieapp.models.Movie;

public class detailsMovieActivity extends AppCompatActivity {
    private ActivityDetailsMovieBinding detailsMovieBinding;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_movie);

        detailsMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_details_movie);
        Intent intent = getIntent();

        if (intent.hasExtra("movie")){

            movie = intent.getParcelableExtra("movie");
            detailsMovieBinding.setMovie(movie);

        }
        detailsMovieBinding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}