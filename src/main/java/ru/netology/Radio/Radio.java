package ru.netology.Radio;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    public void setNewChannel(int newChannel) {
        if ((newChannel < 0) | (newChannel > 9)) {
            return;
        }
        currentNumberStation = newChannel;
    }

    public void nextChannel() {
        if (currentNumberStation == 9) {
            currentNumberStation = 0;
        } else {
            currentNumberStation++;
        }
    }

    public void prevChannel() {
        if (currentNumberStation == 0) {
            currentNumberStation = 9;
        } else {
            currentNumberStation--;
        }
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void turnUpVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
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