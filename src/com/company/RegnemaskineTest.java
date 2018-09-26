package com.company;

import static org.junit.Assert.*;

public class RegnemaskineTest {

    Regnemaskine minTestRegn = new Regnemaskine();

    @org.junit.Test
    public void lægSammen() {

        assertEquals(minTestRegn.lægSammen(3,3), 6);
    }

    @org.junit.Test
    public void tjekÅrstal() {

        assertEquals(minTestRegn.årstal, 2018);
    }


}