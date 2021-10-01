package com.example.fragment.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fragment.R;

public class SongNameActivity extends AppCompatActivity {
    private TextView textViewSongName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_name);
        initIntent();
    }

    private void initIntent() {
        textViewSongName = findViewById(R.id.tv_song_name_new_activity);
        String songName = getIntent().getStringExtra("key");
        textViewSongName.setText(songName);
    }
}