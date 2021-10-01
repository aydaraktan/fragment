package com.example.fragment.ui.fragments.BottomFragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;
import com.example.fragment.models.Song;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<Song> list;
    private OnItemClick onItemClick;

    public void setListener(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<Song> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_son_name_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    //Интерфейс
    public interface OnItemClick {
        void clickItem(String songName);
    }




    //Класс
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView songNumber, songName, singerName, time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songNumber = itemView.findViewById(R.id.tv_number);
            songName = itemView.findViewById(R.id.tv_song_name);
            singerName = itemView.findViewById(R.id.tv_singer_name);
            time = itemView.findViewById(R.id.tv_time);
        }

        public void onBind(Song song) {
            songNumber.setText(song.getSongNumber());
            songName.setText(song.getSongName());
            singerName.setText(song.getSingerName());
            time.setText(song.getTime());

            itemView.setOnClickListener(view -> {
                onItemClick.clickItem(song.getSongName());
            });
        }
    }
}