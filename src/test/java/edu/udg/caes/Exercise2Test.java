package edu.udg.caes;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test
{
    // Cap dels dos vectors pot ser null (nomes es prova amb un dels dos)
    @Test
    public void unionNullVectorTest()
    {
        Vector l_a = new Vector();
        l_a.add(1);
        l_a.add(2);
        Vector l_b = null;

        //Vector l_resposta = Exercise2.union(l_a,l_b);
        assertThrows(NullPointerException.class,() -> Exercise2.union(l_a,l_b));
    }

    // Si algun dels elements es null, se'l saltara.
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
        Vector l_resposta = null;
        try {
            l_resposta = Exercise2.union(l_a,l_b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(l_c,l_resposta);
    }

    // Si hi ha repetits als vectors i/o entre els vectors ens els saltarem
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

        Vector l_resposta = null;
        try {
            l_resposta = Exercise2.union(l_a,l_b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(l_c,l_resposta);
    }

    // Si els vectors son de diferents tipus saltara una excepcio.
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

        assertThrows(Exception.class,() -> Exercise2.union(l_a,l_b));
    }

}
