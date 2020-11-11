package com.kevin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejec = true;
        int op = 0;
        do {
            System.out.println("(1) Circulo\n" +
                    "(2) Cuadrado\n" +
                    "(3) Triangulo Equilatero");

            System.out.println("Ingresa una opcion");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    Circulo circulo = new Circulo();

                    System.out.println("Introduce el radio");
                    var radio = scanner.nextInt();
                    circulo.setRadio(radio);

                    System.out.println("Introduce el diametro");
                    var diametro = scanner.nextInt();
                    circulo.setDiametro(diametro);

                    System.out.println("Area: " + circulo.getArea());
                    System.out.println("Perimetro: " + circulo.getPerimeter());
                    break;

                case 2:
                    Cuadrado cuadrado = new Cuadrado();

                    System.out.println("Introduce el lado");
                    var lado = scanner.nextInt();
                    cuadrado.setLado(lado);

                    System.out.println("Area: " + cuadrado.getArea());
                    System.out.println("Perimetro: " + cuadrado.getPerimeter());
                    break;

                case 3:
                    Triangulo triangulo = new Triangulo();

                    System.out.println("Introduce la base");
                    var base = scanner.nextInt();
                    triangulo.setBase(base);

                    System.out.println("Introduce la altura");
                    var altura = scanner.nextInt();
                    triangulo.setAltura(altura);

                    System.out.println("Area: " + triangulo.getArea());
                    System.out.println("Perimetro: " + triangulo.getPerimeter());
                    break;

                default:
                    ejec = false;
            }

        } while (ejec);


    }
}
