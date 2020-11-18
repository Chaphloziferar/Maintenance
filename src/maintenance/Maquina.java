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
public class Maquina implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String modelo;
    private String NoSerie;
    private Date fechaCompra;
    private Date fechaFabricacion;
    private String lugarFabricacion;
    private byte[] imagen;
    private LinkedList<Mantenimiento> mantenimientos;
    
    public Maquina(String nombre, String modelo, String noSerie, Date fechaCompra, Date fechaFabricacion, String lugarFabricacion, byte[] imagen){
        this.nombre = nombre;
        this.modelo = modelo;
        this.NoSerie = noSerie;
        this.fechaCompra = fechaCompra;
        this.fechaFabricacion = fechaFabricacion;
        this.lugarFabricacion = lugarFabricacion;
        this.imagen = imagen;
        
        this.mantenimientos = new LinkedList<>();
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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    public void AddList(Mantenimiento mantenimiento){
        this.mantenimientos.add(mantenimiento);
    }

    public LinkedList<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }
    
}
