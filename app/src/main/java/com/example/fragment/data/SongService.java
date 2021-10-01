package com.example.fragment.data;

import com.example.fragment.models.Song;

import java.util.ArrayList;

public class SongService {
    private ArrayList<Song> list;
    private Integer i;

    public ArrayList<Song> getList() {
        list = new ArrayList<>();
        i = 1;
        list.add(new Song(i.toString(), "asegs", "John", "3:22"));
        i++;
        list.add(new Song(i.toString(), "rtyu", "Nelly", "3:20"));
        i++;
        list.add(new Song(i.toString(), "mnbv", "T.I", "3:50"));
        i++;
        list.add(new Song(i.toString(), "yhnmjj", "Tarkan", "2:45"));
        i++;
        list.add(new Song(i.toString(), "ujhgfd", "Мирбек Атабеков", "3:00"));
        i++;
        list.add(new Song(i.toString(), "rtgjj", "kot", "4:12"));
        i++;
        list.add(new Song(i.toString(), "rqqqqqq", "Kelly", "5:30"));
        i++;
        list.add(new Song(i.toString(), "vvvvvv", "Daddy", "7:36"));
        i++;
        list.add(new Song(i.toString(), "iiiiiii", "Mommy", "3:55"));
        i++;
        list.add(new Song(i.toString(), "qqqiiikkk", "Juan", "3:55"));
        i++;
        return list;
    }
}
