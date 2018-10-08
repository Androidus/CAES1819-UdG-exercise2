package edu.udg.caes;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test
{
    @Test
    public void unionNullVectorTest()
    {
        Vector l_a = new Vector();
        l_a.add(1);
        l_a.add(2);
        Vector l_b = null;

        Vector l_resposta = Exercise2.union(l_a,l_b);
        assertNull(l_resposta);
    }

    @Test
    public void unionNullElementTest()
    {
        Vector l_a = new Vector();
        l_a.add(1);
        l_a.add(2);
        Vector l_b = new Vector();
        l_b.add(null);
        l_b.add(3);
        Vector l_c = new Vector();
        l_c.add(1);
        l_c.add(2);
        l_c.add(3);
        Vector l_resposta = Exercise2.union(l_a,l_b);
        assertEquals(l_c,l_resposta);
    }

    @Test
    public void unionRepeatTest()
    {
        Vector l_a = new Vector();
        l_a.add(1);
        l_a.add(2);
        Vector l_b = new Vector();
        l_b.add(1);
        l_b.add(3);
        Vector l_c = new Vector();
        l_c.add(1);
        l_c.add(2);
        l_c.add(3);

        Vector l_resposta = Exercise2.union(l_a,l_b);
        assertEquals(l_c,l_resposta);
    }

    @Test
    public void unionSameVectorTypeTest()
    {
        Vector<Integer> l_a = new Vector();
        l_a.add(1);
        l_a.add(2);
        Vector<String> l_b = new Vector();
        l_b.add("1");
        l_b.add("3");
        Vector l_c = new Vector();

        Vector l_resposta = Exercise2.union(l_a,l_b);
        assertThrows(Exception.class,() -> Exercise2.union(l_a,l_b));
    }

}
