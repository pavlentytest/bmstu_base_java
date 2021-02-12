package ru.samsung.itschool.mdev;

// принципы SOLID

public class Car {

    private String name; // ""
    private int power; //0


    public void doBeep() {
        System.out.println("Car beep!");
    }

    Car() {

    }

    Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
