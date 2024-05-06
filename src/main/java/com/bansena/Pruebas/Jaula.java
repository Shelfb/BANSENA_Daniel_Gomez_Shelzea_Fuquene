package com.bansena.Pruebas;

//Tipo de dato generico <E>: cualquier tipo de objeto

public class Jaula<E extends IComportamientoAnimal>{
      //Una jaula solo puede tener dos animales
      //las mascotas pueden ser del tipo que sean
      //pero ambas deben de ser del mismo tipo

      private E mascota1;
      private E mascota2;
      
      public E getMascota1() {
            return mascota1;
      }
      public void setMascota1(E mascota1) {
            this.mascota1 = mascota1;
      }
      public E getMascota2() {
            return mascota2;
      }
      public void setMascota2(E mascota2) {
            this.mascota2 = mascota2;
      }

      //comportamiento para alimentar animales
      public void alimentarMascotas(){
            this.mascota1.alimentarse("Purina");
            this.mascota2.alimentarse("Whiskas");
      }
}
