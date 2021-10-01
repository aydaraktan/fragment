package com.example.fragment.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragment.R;
import com.example.fragment.ui.fragments.BottomFragment.BottomFragment;
import com.example.fragment.ui.fragments.TopFragment.TopFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.container_top, new TopFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_bottom, new BottomFragment()).commit();
    }
}