package com.example.Agregacion;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
  private String nombre;
  private List<Carrera> carreras;

  public Universidad(String nombre) {
      this.nombre = nombre;
      this.carreras = new ArrayList<>();
  }

  public void agregarCarrera(Carrera carrera) {
      carreras.add(carrera);
  }

  public void mostrarCarreras() {
      System.out.println("Carreras en la Universidad " + nombre + ":");
      for (Carrera carrera : carreras) {
          System.out.println(carrera.getNombre());
      }
  }
}