package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckconsecutiveTest {
    Checkconsecutive cc = new Checkconsecutive();
    @Before
    public void setUp() throws Exception
    {
    }    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void checkNumbers1(){
        assertEquals("98,96,95,94,93 non consecutive numbers",cc.checkNumbers("98,96,95,94,93"));    }
    @Test
    public void checkNumbers2(){
        assertEquals("54,53,52,51,50,49,48 are consecutive numbers",cc.checkNumbers("54,53,52,51,50,49,48"));    }
    @Test
    public void checkNumbers3(){
        assertEquals(" 1,2,3,4,5,6,6 non consecutive numbers",cc.checkNumbers("1,2,3,4,5,6,6"));    }

    @Test
    public void checkNumbers() {
    }
}