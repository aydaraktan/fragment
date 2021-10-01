package com.example.fragment.ui.fragments.BottomFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.R;
import com.example.fragment.data.SongService;
import com.example.fragment.ui.activities.SongNameActivity;


public class BottomFragment extends Fragment implements SongAdapter.OnItemClick{
    private RecyclerView recyclerView;
    private SongAdapter songAdapter;
    private SongService songService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.rv_songs);
        songAdapter = new SongAdapter();
        songService = new SongService();
        songAdapter.setList(songService.getList());
        songAdapter.setListener(this);
        recyclerView.setAdapter(songAdapter);

    }

    @Override
    public void clickItem(String songName) {
        Intent intent = new Intent(requireActivity(), SongNameActivity.class);
        intent.putExtra("key", songName);
        startActivity(intent);
    }
}