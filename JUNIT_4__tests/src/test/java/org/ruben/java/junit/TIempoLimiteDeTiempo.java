package org.ruben.java.junit;

import org.junit.Test;

public class TIempoLimiteDeTiempo {

    
    @Test(timeout = 1000)
    public void testPrintMessage() {	
       System.out.println("El test falla si se tarda mas de un segundo.");         
    }
 
}
