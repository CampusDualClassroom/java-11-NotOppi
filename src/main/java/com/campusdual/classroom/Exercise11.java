package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        blackRemote.turnOn();
        blackRemote.channelUp();
        blackRemote.channelDown();
        blackRemote.channelDown();
        blackRemote.volumeUp();
        blackRemote.volumeDown();
        blackRemote.setVolumeToZero();
        blackRemote.volumeDown();
        blackRemote.turnOff();
    }

}