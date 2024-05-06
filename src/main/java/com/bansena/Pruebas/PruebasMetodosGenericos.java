package com.bansena.Pruebas;

public class PruebasMetodosGenericos {

      //Método genérico
      //Método que acepta parámetros 
      //ajustables a cualquier tipo de dato
      static <T> T mostrarElemento(T item){
            return item;
      }
      public static void main(String[] args) {
            //Llamar método
            System.out.println(
                  mostrarElemento("Hola Mundo")
                  );
      }
}
