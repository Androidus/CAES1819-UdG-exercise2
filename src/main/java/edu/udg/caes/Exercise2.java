package edu.udg.caes;

import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     */
    public static Vector union (Vector a, Vector b)
    {
        Vector l_alsDos = new Vector();
        l_alsDos.addAll(a);
        l_alsDos.addAll(b);
        return l_alsDos;
        //throw new UnsupportedOperationException("Non implemented yet");
    }

}
