package com.bansena.Pruebas;

public class Cat implements IComportamientoAnimal{

      @Override
      public void alimentarse(String comida) {
            System.out.println("Miau... He comido" + comida);
      }
      
}
