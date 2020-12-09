package com.company;

public class BallTest {
    public static void main(String[] args) {
        Ball one = new Ball();
        one.setRadius(10);
        one.setColor("red");
        System.out.println("Радиус мяча: " + one.getRadius());
        System.out.print("Цвет мяча: " + one.getColor());
    }
}
