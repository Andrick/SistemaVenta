/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import CapaDatos.Conexion;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionCliente implements IGestion
{
    public static int id;
    public GestionCliente() 
    {
       Conexion.GetInstancia().Enlace();
    }    
   private Cliente client=new Cliente();
    public Cliente getCliente()
    {
        return client;
    }
    public void setCliente(Cliente client)
    {
        this.client=client;
    }
    @Override
    public void Grabar() throws SQLException 
    {
    try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO cliente(numero_pass, nombre, cedula, direccion, telefono) values ('"+this.client.getNumeroPass()+"','"+this.client.getNombre()+"','"+this.client.getCedula()+"','"+this.client.getDireccion()+"','"+this.client.getTelefono()+"')");
            Conexion.GetInstancia().Desconectar();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    @Override
    public void Modificar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("UPDATE cliente SET numero_pass='"+this.client.getNumeroPass()+"',  nombre='"+this.client.getNombre()+"', cedula='"+this.client.getCedula()+"', direccion='"+this.client.getDireccion()+"', telefono='"+this.client.getTelefono()+"'");
            Conexion.GetInstancia().Desconectar();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    @Override
    public void Nuevo() throws SQLException 
    {
        this.client.setCedula(" ");
        this.client.setNombre(" ");
        this.client.setDireccion(" ");
        this.client.setTelefono("");
        this.client.setNumeroPass("");
    }
    @Override
    public void Eliminar() throws SQLException 
    {  
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM Cliente where cedula='"+this.client.getCedula()+"' ");
            Conexion.GetInstancia().Desconectar();
        }
        catch(SQLException e)
        {
            throw e;
        }
    }
    @Override
    public void Consultar() throws SQLException 
    {
        Conexion.GetInstancia().Conectar();    
        ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT numero_pass, id_cliente, nombre, cedula, direccion, telefono  FROM cliente WHERE cedula ='"+client.getCedula()+"'");
        while(cn.next())
        {
            this.client.setNumeroPass(cn.getString(1));
            this.client.setIdCliente(cn.getInt(2));
            this.client.setNombre(cn.getString(3));
            this.client.setCedula(cn.getString(4));
            this.client.setDireccion(cn.getString(5));
            this.client.setTelefono(cn.getString(6));
            id =(this.client.getIdCliente());           
        }
            Conexion.GetInstancia().Desconectar();
    }
}