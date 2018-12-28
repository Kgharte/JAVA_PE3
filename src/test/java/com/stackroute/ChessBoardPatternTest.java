package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

        @Test
        public void TestCase1() throws IOException {
            assertEquals(8, ChessBoardPattern.NumberOfRows());
        }
    @Test
    public void TestCase2() throws IOException {
        assertEquals(true, ChessBoardPattern.CheckWWIsThereORNot("WW"));
    }
    @Test
    public void TestCase3() throws IOException {
        assertEquals(true, ChessBoardPattern.ChechPipeIsThereOrNot());
    }
    }
