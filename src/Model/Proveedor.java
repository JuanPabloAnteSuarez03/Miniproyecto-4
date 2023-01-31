/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;


/**
 *
 * @author Leon
 */
public class Proveedor {
    
    private int codigo;
    private String nombre;
    private LocalDate fechaCrea;
    private int nit;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(int codigo, String nombre, LocalDate fechaCrea, int nit, int telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCrea = fechaCrea;
        this.nit = nit;
        this.telefono = telefono;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
