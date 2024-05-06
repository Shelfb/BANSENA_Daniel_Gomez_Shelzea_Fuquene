package com.bansena.Pruebas;

public class PuebaJaulas {
      public static void main(String[] args) {
        //Primera jaula solo va a albergar perros
        Dog perro1 = new Dog();
        Dog perro2 = new Dog();
        Cat gato1 = new Cat();
        Cat gato2 = new Cat();
        
        Jaula<Dog> jaula1 = new Jaula<Dog>();
        jaula1.setMascota1(perro1);
        jaula1.setMascota2(perro2);


        Jaula<Cat> jaula2 = new Jaula<Cat>();
        jaula2.setMascota1(gato1);
        jaula2.setMascota2(gato2);
      }
}