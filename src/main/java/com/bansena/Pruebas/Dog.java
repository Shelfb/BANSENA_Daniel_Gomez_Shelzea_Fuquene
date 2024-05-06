package com.bansena.Pruebas;

public class Dog implements IComportamientoAnimal{

      @Override
      public void alimentarse(String comida) {
            System.out.println("Wuof... He comido" + comida);
      }
      
}
