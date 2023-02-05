package com.example.todolist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class musicActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer player;
    MediaPlayer player2;
    MediaPlayer player3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_playlist);

        Button backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);
    }

     public void play(View v) {
        if (player == null){
            stopPlayer2();
            stopPlayer3();
            player = MediaPlayer.create(this, R.id.);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });

        }
        player.start();
    }

    public void play2(View v) {
        if (player2 == null){
            stopPlayer();
            stopPlayer3();
            player2 = MediaPlayer.create(this, R.raw.song2);
            player2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer2();
                }
            });

        }
        player2.start();
    }

    public void play3(View v) {
        if (player3 == null){
            stopPlayer();
            stopPlayer2();
            player3 = MediaPlayer.create(this,R.);
            player3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer3();
                }
            });

        }
        player3.start();
    }

    public void pause(View v) {
        if (player != null){
            player.pause();
        }

    }

    public void pause2(View v) {
        if (player2 != null){
            player2.pause();
        }

    }

    public void pause3(View v) {
        if (player3 != null){
            player3.pause();
        }

    }

    public void stop(View v) {
        stopPlayer();
    }

    public void stop2(View v) {
        stopPlayer2();
    }

    public void stop3(View v) {
        stopPlayer3();
    }

    public void stopPlayer() {
        if (player != null){
            player.release();
            player = null;
            Toast.makeText(this,"Media Has Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopPlayer2() {
        if (player2 != null){
            player2.release();
            player2 = null;
            Toast.makeText(this,"Media Has Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopPlayer3() {
        if (player3 != null){
            player3.release();
            player3 = null;
            Toast.makeText(this,"Media Has Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backbtn:
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
                break;

        }
    }
}

