/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JefNxtor
 */
@XmlRootElement //objeto serializado para servicio rests,tecn jaxv
public class Empleado 
{

    public Empleado(int id, String nombre, String cedula, String direccion, String telefono, String cargo)
    {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
    }
    public Empleado() 
    {

    }
    private int id;
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String cargo;
    
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public String getCedula()
    {
        return cedula;
    }
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    public String getDireccion() 
    {
        return direccion;
    }
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    public String getTelefono() 
    {
        return telefono;
    }
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    public String getCargo() 
    {
        return cargo;
    }
    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }
}