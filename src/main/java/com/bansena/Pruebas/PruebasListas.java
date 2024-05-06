package com.bansena.Pruebas;

import java.util.ArrayList;
import java.util.List;

public class PruebasListas {
      public static void main(String[] args) {
            List<Integer> lEnteros = 
                  new ArrayList<Integer>();

            lEnteros.add(2);
            lEnteros.add(5);
            lEnteros.add(50);
            lEnteros.add(45);
            lEnteros.add(4);

            //Método get (ÍNDICE)
            System.out.println(lEnteros.get(0));

            //Ciclo for
            for ( Object n : lEnteros ){
                  Integer numero = (Integer) n;
                  System.out.println(numero);
            }
      }
}
