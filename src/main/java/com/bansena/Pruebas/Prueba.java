package com.bansena.Pruebas;

import java.time.LocalDate;

import com.bansena.Entidades.Campana;

public class Prueba {

      public static void main(String[] args) {
            
            Campana ca = new Campana(500.00, 
                              "Día de la madre", 
                              LocalDate.of(2024, 05, 12), 
                              LocalDate.of(2024, 05, 12));
      }

}
