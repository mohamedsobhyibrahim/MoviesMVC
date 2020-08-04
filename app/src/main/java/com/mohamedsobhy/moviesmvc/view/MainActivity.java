package com.mohamedsobhy.moviesmvc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohamedsobhy.moviesmvc.R;
import com.mohamedsobhy.moviesmvc.models.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView movieNameTextView;
    Button getMovieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieNameTextView = findViewById(R.id.textView);
        getMovieButton = findViewById(R.id.button);
        getMovieButton.setOnClickListener(this);
    }

    // Controller
    public MovieModel getMovieFromDatabase(){
        return new MovieModel("cast away" , "1-1-1997" , "very sad movie" , 1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                movieNameTextView.setText(getMovieFromDatabase().getName());
                break;
        }
    }
}