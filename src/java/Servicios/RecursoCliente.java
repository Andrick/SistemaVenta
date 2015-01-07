/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Cliente;
import Gestion.GestionCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author JefNxtor
 */

@Path("RecursoCliente")
public class RecursoCliente 
{
    GestionCliente gCliente = new GestionCliente();  
    public static List<Cliente> ListaCliente = new ArrayList<>();    
    
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String Consultar(@QueryParam("cedula") String parametro)
    {
        gCliente.getCliente().setCedula(parametro);   
        try 
        {
            gCliente.Consultar();
        } 
        catch (SQLException e) 
        {
                return"Error" + e;
        }
        return null;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String Insertar(Cliente objCliente) 
    {
        gCliente.getCliente().setCedula(objCliente.getCedula());
        gCliente.getCliente().setDireccion(objCliente.getDireccion());
        gCliente.getCliente().setNombre(objCliente.getNombre());
        gCliente.getCliente().setNumeroPass(objCliente.getNumeroPass());
        gCliente.getCliente().setTelefono(objCliente.getTelefono());
        try 
        {
            gCliente.Grabar();
            return "Cliente Registrado";
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Recurso.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN) 
    public String modificar(Cliente objCliente)
    {
        gCliente.getCliente().setCedula(objCliente.getCedula());
        gCliente.getCliente().setDireccion(objCliente.getDireccion());
        gCliente.getCliente().setNombre(objCliente.getNombre());
        gCliente.getCliente().setNumeroPass(objCliente.getNumeroPass());
        gCliente.getCliente().setTelefono(objCliente.getTelefono());
    
        try 
        {
            gCliente.Modificar();
            return "Cliente Modificado ";
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Recurso.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
    }
    @DELETE
    @Path("{para1}")
    //@Produces(MediaType.TEXT_PLAIN)
    public String eliminar(@PathParam("para1") String variable)
    {
        ListaCliente.clear();
        return "Eliminado con Exito";
    }
}