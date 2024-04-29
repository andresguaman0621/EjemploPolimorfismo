package com.example.Herencia;

public class Figura {

  protected String color;

  public Figura(String color) {
      this.color = color;
  }

  public double area() {
      return 0.0;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

}
