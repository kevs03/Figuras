package com.kevin;

public class Triangulo implements Shape {
    //Este solo es para un triangulo equilatero
    private int base;
    private int altura;

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura)/2;
    }

    @Override
    public double getPerimeter() {
        return base * 3;
    }

}
