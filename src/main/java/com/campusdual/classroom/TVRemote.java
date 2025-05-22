package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote (String color){
        this.channel = 0;
        this.volume = 20;
        this.color = color;
    }

    public boolean turnOn(){
        this.on = true;
        return this.on;
    }
    public boolean turnOff(){
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        }
        else
            System.out.println("El canal ya esta en el cero y no se puede bajar mas");
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }else
            System.out.println("El volumen ya esta en el cero y no se puede bajar mas");
    }

    public String getColor() {
        return this.color;
    }

    public void setVolumeToZero(){
        this.volume = 0;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }
}
