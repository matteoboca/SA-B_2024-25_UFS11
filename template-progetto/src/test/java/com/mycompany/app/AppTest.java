package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testVeicolo()
    {
        Auto automobile = new Auto(124,23000,"Benzina","Opel","sportiva","Corsa",2011);
        assertEquals("Opel", automobile.getMarca());
    }

}
