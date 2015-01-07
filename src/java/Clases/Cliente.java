/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

public class Cliente
{
    public Cliente(int idCliente, String numeroPass, String cedula, String nombre, int idPersona, String telefono, String direccion) 
    {
        this.idCliente = idCliente;
        this.numeroPass = numeroPass;
        this.cedula = cedula;
        this.nombre = nombre;
        this.idPersona = idPersona;
        this.telefono = telefono;
        this.direccion = direccion;
    }   
    private static int idCliente;
    private String numeroPass;
    private String cedula;
    private String nombre;
    private int idPersona;
    private String telefono;

    public Cliente() 
    {
        
    }
    public int getIdCliente() 
    {
        return idCliente;
    }
    public void setIdCliente(int idCliente) 
    {
        this.idCliente = idCliente;
    }
    public String getNumeroPass() 
    {
        return numeroPass;
    }
    public void setNumeroPass(String numeroPass) 
    {
        this.numeroPass = numeroPass;
    }
    public String getCedula() 
    {
        return cedula;
    }
    public void setCedula(String cedula)
    {
        try 
        { 
            this.cedula = cedula;
        } 
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
           try
           { 
               this.nombre = nombre;
           }
           catch(Exception ex)
           {
               System.out.println(ex);
           }
    }
    public int getIdPersona() 
    {
        return idPersona;
    }
    public void setIdPersona(int idPersona) 
    {
        try 
        { 
            this.idPersona = idPersona;
        } 
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public String getTelefono() 
    {
        return telefono;
    }
    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }
    private String direccion;

    public String getDireccion() 
    {
        return direccion;
    }
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }   
}