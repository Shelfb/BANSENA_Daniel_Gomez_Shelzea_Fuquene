package com.bansena.Entidades;

import java.time.LocalDate;

public class TarjetaDebito <T extends Habilitantes>{
    private Long numeroTarjeta;
    private LocalDate fechaVencimiento;
    private Double tope;

    private CuotaDeManejo<T> cuotaDeManejo;
    
    public TarjetaDebito(Long numeroTarjeta, LocalDate fechaVencimiento, Double tope) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.tope = tope;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getTope() {
        return tope;
    }

    public void setTope(Double tope) {
        this.tope = tope;
    }

    public void setCuotaDeManejo(CuotaDeManejo<T> cuotaDeManejo) {
        this.cuotaDeManejo = cuotaDeManejo;
    }

}
