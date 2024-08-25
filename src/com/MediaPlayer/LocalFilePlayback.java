package com.MediaPlayer;

public class LocalFilePlayback extends MediaPlaybackImpl {
    public LocalFilePlayback(MediaSource mediaSource) {
        super(mediaSource);
    }

    @Override
    public void play() {
        System.out.println("Playing local file...");
        super.play();
    }

    @Override
    public void pause() {
        System.out.println("Pausing local file...");
        super.pause();
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file...");
        super.stop();
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for local file...");
        super.setVolume(volume);
    }
}