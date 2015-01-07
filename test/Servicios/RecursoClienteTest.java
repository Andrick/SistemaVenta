/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Cliente;
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
public class RecursoClienteTest {
    
    public RecursoClienteTest() {
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
     * Test of Consultar method, of class RecursoCliente.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        String parametro = "";
        RecursoCliente instance = new RecursoCliente();
        String expResult = "";
        String result = instance.Consultar(parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class RecursoCliente.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Cliente objCliente = null;
        RecursoCliente instance = new RecursoCliente();
        String expResult = "";
        String result = instance.Insertar(objCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class RecursoCliente.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Cliente objCliente = null;
        RecursoCliente instance = new RecursoCliente();
        String expResult = "";
        String result = instance.modificar(objCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class RecursoCliente.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String variable = "";
        RecursoCliente instance = new RecursoCliente();
        String expResult = "";
        String result = instance.eliminar(variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
