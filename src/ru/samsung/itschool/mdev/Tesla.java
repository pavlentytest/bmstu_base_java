package ru.samsung.itschool.mdev;

public class Tesla extends Car {
    private double capacity;

    Tesla() {

    }

    public Tesla(String name, int power, double capacity) {
        super(name, power);
        this.capacity = capacity;
    }

    @Override
    public void doBeep() {
        //super.doBeep();
    }
}
