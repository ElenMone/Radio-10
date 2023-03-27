package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setNewChannel(5);
        radio.nextChannel();

        int expected = 6;
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
        radio.setNewChannel(6);
        radio.prevChannel();

        int expected = 5;
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
        radio.setNewChannel(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.setNewChannel(12);

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
    public void shouldGetMaxStation() {
        Radio radio = new Radio(22);

        Assertions.assertEquals(21, radio.getMaxChannel());
    }

    @Test
    public void shouldSetNewStationWithConstructor() {
        Radio radio = new Radio(45);
        radio.setNewChannel(43);

        Assertions.assertEquals(43, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio(12);
        radio.setNewChannel(22);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldChangeStationMaxToZero() {
        Radio radio = new Radio(22);
        radio.setNewChannel(radio.getMaxChannel());
        radio.nextChannel();


        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldChangeStationZeroToMax() {
        Radio radio = new Radio(22);
        radio.setNewChannel(radio.getMinChannel());
        radio.prevChannel();

        Assertions.assertEquals(21, radio.getCurrentNumberStation());

    }

    @Test
    public void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.turnUpVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.turnUpVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.turnDownVolume();

        int expected = 6;
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
}