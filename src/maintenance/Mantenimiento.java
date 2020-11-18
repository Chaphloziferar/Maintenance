/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author John
 */
public class Mantenimiento implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String tipo;
    private double costo;
    private double duracion;
    private int frecuencia;
    private double costoTotal;
    public LinkedList<Date> fechas;
    
    public Mantenimiento(String nombre, String tipo, double costo, double duración, int frecuencia, double costoTotal){
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.duracion = duración;
        this.frecuencia = frecuencia;
        this.costoTotal = costoTotal;
        
        this.fechas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public void AddList(Date fecha){
        this.fechas.add(fecha);
    }

    public LinkedList<Date> getMantenimientos() {
        return fechas;
    }
    
}
