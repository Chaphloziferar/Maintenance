/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author John
 */
public class Maquina {
    
    private String nombre;
    private String modelo;
    private String NoSerie;
    private Date fechaCompra;
    private Date fechaFabricacion;
    private String lugarFabricacion;
    private LinkedList<Mantenimiento> mantenimientos;
    
    public Maquina(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNoSerie() {
        return NoSerie;
    }

    public void setNoSerie(String NoSerie) {
        this.NoSerie = NoSerie;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getLugarFabricacion() {
        return lugarFabricacion;
    }

    public void setLugarFabricacion(String lugarFabricacion) {
        this.lugarFabricacion = lugarFabricacion;
    }
    
    
    
}
