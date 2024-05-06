package com.bansena.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Titulares {

      private String nombre;
      private Long numeroDeIdentificacion;

      //Atributo de relacion
      //<> operador diamante
      private List<CuentaBancaria> cuentasBancarias =
            new ArrayList<CuentaBancaria>();


      public String getNombre() {
            return nombre;
      }


      public void setNombre(String nombre) {
            this.nombre = nombre;
      }


      public Long getNumeroDeIdentificacion() {
            return numeroDeIdentificacion;
      }


      public void setNumeroDeIdentificacion(Long numeroDeIdentificacion) {
            this.numeroDeIdentificacion = numeroDeIdentificacion;
      }


      public Titulares(String nombre, Long numeroDeIdentificacion) {
            this.nombre = nombre;
            this.numeroDeIdentificacion = numeroDeIdentificacion;
      }


      public List<CuentaBancaria> getCuentasBancarias() {
            return cuentasBancarias;
      }


      public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
            this.cuentasBancarias = cuentasBancarias;
      }

}
