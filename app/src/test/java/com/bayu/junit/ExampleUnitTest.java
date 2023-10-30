package com.bayu.junit;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    @Test
    // membuat fungsi
    public void addition_isCorrect() {
        //memanggil class luas_persegipanjang lalu membuat objek a
        luas_persegipanjang a = new luas_persegipanjang();
        // lalu buat variabel, memanggil objek dan memanggil parameter pada class luas_persegipanjang
        int hasil = a.luas_add(5,2);
        //assertEqual digunakan untuk menegaskan apakah hasil dari variabel hasil sama dengan isi pada assertEquals
        assertEquals(10, hasil);
    }
}