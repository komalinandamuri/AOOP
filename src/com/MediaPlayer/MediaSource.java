package com.MediaPlayer;

public interface MediaSource {
    void play();
    void pause();
    void stop();
    void setVolume(int volume);
}
