package com.kevin;

public class Cuadrado implements Shape {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimeter() {
        return lado * 4;
    }
}
