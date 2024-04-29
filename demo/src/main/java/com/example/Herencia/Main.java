package com.example.Herencia;

public class Main {
    public static void main(String[] args) {
        // //HERENCIA
        // //Andres Guaman
        // Circulo circulo = new Circulo(5.0, "Rojo");
        // //metodo del padre
        // circulo.setColor("Verde cambiado desde el padre");
        // System.out.println("Área del círculo: " + circulo.area());
        // System.out.println("Color del círculo: " + circulo.getColor());
        // Rectangulo rectangulo = new Rectangulo(4.0, 6.0, "Azul");
        // rectangulo.setColor("Amarillo camiado desde el padre");
        // System.out.println("Área rectángulo: " + rectangulo.area());
        // System.out.println("Color rectángulo: " + rectangulo.getColor());

        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo(5.0, "Rojo");
        figuras[1] = new Rectangulo(4.0, 6.0, "Cafe");

        for (Figura figura : figuras) {
            System.out.println("Area de la figura: " + figura.area());
            System.out.println("Color de la figura: " + figura.getColor());
        }
        
    }
}