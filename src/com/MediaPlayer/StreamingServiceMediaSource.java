package com.MediaPlayer;

public class StreamingServiceMediaSource implements MediaSource {
    @Override
    public void play() {
        System.out.println("Playing streaming service media source...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing streaming service media source...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping streaming service media source...");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for streaming service media source...");
    }
}
