package com.MediaPlayer;

public class RadioStationPlayback extends MediaPlaybackImpl {
    public RadioStationPlayback(MediaSource mediaSource) {
        super(mediaSource);
    }

    @Override
    public void play() {
        System.out.println("Playing radio station...");
        super.play();
    }

    @Override
    public void pause() {
        System.out.println("Pausing radio station...");
        super.pause();
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio station...");
        super.stop();
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting volume for radio station...");
        super.setVolume(volume);
    }
}
