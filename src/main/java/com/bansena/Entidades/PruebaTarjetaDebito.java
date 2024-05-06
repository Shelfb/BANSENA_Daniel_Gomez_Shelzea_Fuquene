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

        //C
        CuentaBancaria cb = new CuentaBancaria<>(1234567890L,
                                                10000000.0,
                                                "COL", t1);
        //Vinculación
        cb.lManejos.add(cm);

        System.out.println("Cuenta bancaria");                  
        System.out.println("Número de cuenta: " + cb.getNumero());
        System.out.println("Saldo: " + cb.getSaldoInicial());
        System.out.println("Divisa: " + cb.getDivisa());
        

        System.out.println("Tarjeta de Debito");
        System.out.println("Número de tarjeta: " + t1.getNumeroTarjeta());
        System.out.println("Fecha de expedición: " + t1.getFechaVencimiento());
        System.out.println("Tope: " + t1.getTope());

        
        System.out.println("Campaña");
        System.out.println("Valor de la campaña: " + c.getValor());
        System.out.println("Código de la campaña: " + c.getNombre());
        System.out.println("Fecha de inicio: " + c.getFechaInicio());
        System.out.println("Fecha de fin: " + c.getFechaFin());



        for (Object obj : cb.lManejos) {
            CuotaDeManejo<?> cM = (CuotaDeManejo<?>) obj;
            System.out.println("\t" + cm);
        }  
    }

}
