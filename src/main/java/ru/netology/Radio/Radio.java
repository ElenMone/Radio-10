package ru.netology.Radio;

public class Radio {
    private int channelCount = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentNumberStation = minStation;
    private int currentVolume;

    public Radio(int channelCount) {
        this.maxStation = channelCount - 1;
    }

    public Radio() {

    }

    public void setNewChannel(int newStation) {
        if ((newStation < 0) | (newStation > maxStation)) {
            return;
        }
        currentNumberStation = newStation;
    }

    public int getMaxChannel() {
        return maxStation;
    }

    public int getMinChannel() {
        return minStation;
    }

    public void nextChannel() {
        if (currentNumberStation == maxStation) {
            currentNumberStation = 0;
        } else {
            currentNumberStation++;
        }
    }

    public void prevChannel() {
        if (currentNumberStation == 0) {
            currentNumberStation = maxStation;
        } else {
            currentNumberStation--;
        }
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void turnUpVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}