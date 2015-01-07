/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Empleado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JefNxtor
 */
public class RecursoTest {
    
    public RecursoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Consultar method, of class Recurso.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        String parametro = "";
        Recurso instance = new Recurso();
        String expResult = "";
        String result = instance.Consultar(parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class Recurso.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Empleado objEmpleado = null;
        Recurso instance = new Recurso();
        String expResult = "";
        String result = instance.Insertar(objEmpleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class Recurso.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Empleado objEmpleado = null;
        Recurso instance = new Recurso();
        String expResult = "";
        String result = instance.modificar(objEmpleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Recurso.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String variable = "";
        Recurso instance = new Recurso();
        String expResult = "";
        String result = instance.eliminar(variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
