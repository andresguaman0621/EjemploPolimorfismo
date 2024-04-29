package com.example.Agregacion;

public class Run {
  public static void main(String[] args) {
    Universidad universidad = new Universidad("Universidad XYZ");
    Carrera carrera1 = new Carrera("Inegenieria software");
    Carrera carrera2 = new Carrera("Arquitectura");
    universidad.agregarCarrera(carrera1);
    universidad.agregarCarrera(carrera2);
    universidad.mostrarCarreras();
}
}
