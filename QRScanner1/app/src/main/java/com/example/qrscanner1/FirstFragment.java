package com.example.qrscanner1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FirstFragment extends YouTubeBaseActivity {

    private YouTubePlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Intent i = getIntent();

       final String videoId = i.getStringExtra("firstKeyName");
        //final EditText editTextId = findViewById(R.id.editTextId);
        //Button buttonPlay = findViewById(R.id.buttonPlay);
        final YouTubePlayerView youtubePlayerView = findViewById(R.id.youtubePlayerView);
        playVideo(videoId, youtubePlayerView);
        /*buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*String videoId = "ySjs3YirSHQ";*//*
                playVideo(videoId, youtubePlayerView);
            }
        });*/


    }

    public void playVideo(final String videoId, final YouTubePlayerView youTubePlayerView) {
        //initialize youtube player view
        youTubePlayerView.initialize("AIzaSyAy0iCHBwlS64q5Nq6_pk_moF5qR0cclnM",
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {
                        player = youTubePlayer;
                        player.cueVideo(videoId);
                        player.setFullscreen(true);
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
    }


}