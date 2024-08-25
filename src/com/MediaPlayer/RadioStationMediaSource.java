package com.MediaPlayer;

public class RadioStationMediaSource implements MediaSource {
    @Override
    public void play() {
        System.out.println("Playing radio station media source...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing radio station media source...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio station media source...");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for radio station media source...");
    }
}
