package com.bayu.junit;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        luas_persegipanjang a = new luas_persegipanjang();
        int hasil = a.luas_add(5,2);
        assertEquals(10, hasil);
    }
}