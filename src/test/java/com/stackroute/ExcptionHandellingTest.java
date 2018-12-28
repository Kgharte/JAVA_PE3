package com.stackroute;


import org.junit.Test;

import static org.junit.Assert.*;

public class ExcptionHandellingTest {

    ExcptionHandelling excptionHandelling = new ExcptionHandelling("array");


    @Test
    public void testMain1() {
        //act
        boolean expected = true;

        boolean result = excptionHandelling.main(new int[5]);
        assertEquals(expected,result);

        }

    @Test
    public void testMain2() {
        //act
        boolean expected = false;

        boolean result = excptionHandelling.main(new int[3]);
        assertNotEquals(expected,result);

    }



}
