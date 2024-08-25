package com.MediaPlayer;

public class StreamingServicePlayback extends MediaPlaybackImpl {
    public StreamingServicePlayback(MediaSource mediaSource) {
        super(mediaSource);
    }

    @Override
    public void play() {
        System.out.println("Playing streaming service...");
        super.play();
    }

    @Override
    public void pause() {
        System.out.println("Pausing streaming service...");
        super.pause();
    }

    @Override
    public void stop() {
        System.out.println("Stopping streaming service...");
        super.stop();
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for streaming service...");
        super.setVolume(volume);
    }
}