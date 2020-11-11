package com.kevin;

public class Circulo implements Shape{
    private double radio;
    private double diametro;
    public static final double Pi = 3.1416;


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double getArea() {
        return Pi * (radio*radio);
    }

    @Override
    public double getPerimeter() {
        return Pi * (diametro);
    }

}
