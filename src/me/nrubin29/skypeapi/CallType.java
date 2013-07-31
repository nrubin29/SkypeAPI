package me.nrubin29.skypeapi;

public enum CallType {

    VIDEO(true), AUDIO(false);

    private boolean video;

    CallType(boolean video) {
        this.video = video;
    }

    public boolean isVideo() {
        return video;
    }
}
