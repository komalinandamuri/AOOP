package com.MediaPlayer;

public class LocalFileMediaSource implements MediaSource {
    @Override
    public void play() {
        System.out.println("Playing local file media source...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing local file media source...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file media source...");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for local file media source...");
    }
}
