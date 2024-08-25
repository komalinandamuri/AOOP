package com.MediaPlayer;

public abstract class MediaPlaybackImpl implements MediaPlaybackInterface {
    protected MediaSource mediaSource;

    public MediaPlaybackImpl(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public void play() {
        mediaSource.play();
    }

    public void pause() {
        mediaSource.pause();
    }

    public void stop() {
        mediaSource.stop();
    }

    public void setVolume(int volume) {
        mediaSource.setVolume(volume);
    }
}
