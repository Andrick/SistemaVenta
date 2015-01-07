/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Gestion.GestionEmpleado;
import Clases.Empleado;
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
//jaxrs
@Path("ejemplo")
public class Recurso 
{
    GestionEmpleado cli = new GestionEmpleado();  
    public static List<Empleado> ListaEmpleado = new ArrayList<>();    
    
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String Consultar(@QueryParam("cedula") String parametro)
    {
    cli.getEmpleado().setCedula(parametro);   
        try {
            cli.Consultar();
        } catch (SQLException e) {
                return"Error" + e;
        }
        return null;
     
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String Insertar(Empleado objEmpleado) {
       cli.getEmpleado().setCedula(objEmpleado.getCedula());
       cli.getEmpleado().setDireccion(objEmpleado.getDireccion());
       cli.getEmpleado().setNombre(objEmpleado.getNombre());
       cli.getEmpleado().setTelefono(objEmpleado.getTelefono());
       cli.getEmpleado().setCargo(objEmpleado.getCargo());

        try {
            cli.Grabar();
            return "Empleado Registrado ";
        } catch (SQLException ex) {
            Logger.getLogger(Recurso.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN) 
    public String modificar(Empleado objEmpleado){
       cli.getEmpleado().setCedula(objEmpleado.getCedula());
       cli.getEmpleado().setDireccion(objEmpleado.getDireccion());
       cli.getEmpleado().setNombre(objEmpleado.getNombre());
       cli.getEmpleado().setTelefono(objEmpleado.getTelefono());
       cli.getEmpleado().setCargo(objEmpleado.getCargo());
    
         try {
            cli.Modificar();
            return "Empleado Modificado ";
        } catch (SQLException ex) {
            Logger.getLogger(Recurso.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
    }
    
    @DELETE
    @Path("{para1}")
    //@Produces(MediaType.TEXT_PLAIN)
    public String eliminar(@PathParam("para1") String variable)
    {
        ListaEmpleado.clear();
        return "Eliminado con Exito";
    }
}
