package edu.udg.caes;

import com.sun.istack.internal.NotNull;
import com.sun.prism.shader.Solid_TextureFirstPassLCD_AlphaTest_Loader;

import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors.
     *          Cap dels vectors pot ser null.
     *          Si conte nulls com a elements, es saltara l'element null.
     *          a i b han de ser del mateix tipus.
     */
    @NotNull
    public static Vector union (@NotNull Vector a, @NotNull Vector b) throws Exception {
        Vector l_alsDos = new Vector();
        a.removeElement(null);
        b.removeElement(null);
        if(!a.isEmpty() && !b.isEmpty() && a.get(0).getClass().equals(b.get(0).getClass()))
        {
            for(int i=0; i<a.size();i++)
            {
                if(a.get(i)!=null && !l_alsDos.contains(a.get(i)))
                {
                    l_alsDos.add(a.get(i));
                }
            }
            for(int j=0;j<b.size();j++)
            {
                if(b.get(j)!=null && !l_alsDos.contains(b.get(j)))
                {
                    l_alsDos.add(b.get(j));
                }
            }
            return l_alsDos;
        }
        else
        {
            throw new Exception();
        }

        //throw new UnsupportedOperationException("Non implemented yet");
    }

}
