package com.bansena.Entidades;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

      Long numero;
      Double saldoInicial;
      String divisa;

      TarjetaDebito TarjetaDebito;

      public Long getNumero() {
            return numero;
      }


      public void setNumero(Long numero) {
            this.numero = numero;
      }


      public Double getSaldoInicial() {
            return saldoInicial;
      }


      public void setSaldoInicial(Double saldoInicial) {
            this.saldoInicial = saldoInicial;
      }


      public String getDivisa() {
            return divisa;
      }


      public void setDivisa(String divisa) {
            this.divisa = divisa;
      }


      public CuentaBancaria(Long numero, Double saldoInicial, String divisa) {
            this.numero = numero;
            this.saldoInicial = saldoInicial;
            this.divisa = divisa;
      }



      List <CuotaDeManejo> lManejos = 
            new ArrayList<CuotaDeManejo>();

            public List<CuotaDeManejo> getlManejos() {
                  return lManejos;
            }
      
      
            public void setlManejos(List<CuotaDeManejo> lManejos) {
                  this.lManejos = lManejos;
            }

}
