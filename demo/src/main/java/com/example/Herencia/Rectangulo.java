package com.example.Herencia;

public class Rectangulo extends Figura {
  private double base;
  private double altura;

  public Rectangulo(double base, double altura, String color) {
      super(color);
      this.base = base;
      this.altura = altura;
  }

  @Override
  public double area() {
      return base * altura;
  }
}
