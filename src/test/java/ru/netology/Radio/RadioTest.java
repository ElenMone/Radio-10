package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setNewChannel(2);
        radio.nextChannel();

        int expected = 3;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationNineToZero() {
        Radio radio = new Radio();
        radio.setNewChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setNewChannel(8);
        radio.prevChannel();

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationZeroToNine() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStation() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.setNewChannel(7);

        int expected = 7;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.setNewChannel(15);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setNewChannel(4);
        radio.setNewChannel(-2);

        int expected = 4;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.turnUpVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.turnDownVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownLessZeroVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newShouldNotTurnDownLessZeroVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}