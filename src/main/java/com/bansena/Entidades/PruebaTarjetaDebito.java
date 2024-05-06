package com.bansena.Entidades;

import java.time.LocalDate;

public class PruebaTarjetaDebito {
    public static void main(String[] args) {

        //Crear el habilitante
        Campana c = new Campana(500.00, "ADSO", LocalDate.
        now(), LocalDate.of(2024, 8, 6));

        //Crear la cuota de manejo 
        CuotaDeManejo<Campana> cm = new CuotaDeManejo<Campana>(c);

        //Crear la tarjeta débito
        TarjetaDebito<Campana> t1 = new TarjetaDebito<>(
                                        123456789L, 
                                        LocalDate.now(), 
                                        10000000.0);

        t1.setCuotaDeManejo(cm);
    }
}
