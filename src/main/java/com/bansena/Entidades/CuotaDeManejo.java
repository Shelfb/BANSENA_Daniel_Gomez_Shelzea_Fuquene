package com.bansena.Entidades;

public class CuotaDeManejo <E extends Habilitantes>{

    private E habilitante;

    public CuotaDeManejo(E habilitante) {
        this.habilitante = habilitante;
    }

    public E getHabilitante() {
        return habilitante;
    }

    public void setHabilitante(E habilitante) {
        this.habilitante = habilitante;
    }

}
