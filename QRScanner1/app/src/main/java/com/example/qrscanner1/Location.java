package com.example.qrscanner1;

public class Location {

    private String item;
    private String video_id;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Location() {
    }

    Location(String item, String video_id) {
        this.item = item;
        this.video_id = video_id;
    }

    public String getItem() {
        return item;
    }

    public String getVideo_id() {
        return video_id;
    }
}