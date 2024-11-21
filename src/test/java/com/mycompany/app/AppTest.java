package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
 // Unit test cho phương thức isPrime
    @Test
    public void testIsPrime() {
    	 App PrimeNumberChecker = new App();
        // Kiểm tra các số nguyên tố
        assertTrue(PrimeNumberChecker.isPrime(2), "2 là số nguyên tố.");
        assertTrue(PrimeNumberChecker.isPrime(3), "3 là số nguyên tố.");
        assertTrue(PrimeNumberChecker.isPrime(5), "5 là số nguyên tố.");
        assertTrue(PrimeNumberChecker.isPrime(29), "29 là số nguyên tố.");
        
        // Kiểm tra các số không phải là số nguyên tố
        assertFalse(PrimeNumberChecker.isPrime(1), "1 không phải là số nguyên tố.");
        assertFalse(PrimeNumberChecker.isPrime(4), "4 không phải là số nguyên tố.");
        assertFalse(PrimeNumberChecker.isPrime(6), "6 không phải là số nguyên tố.");
        assertFalse(PrimeNumberChecker.isPrime(30), "30 không phải là số nguyên tố.");
    }

    // Kiểm tra số âm, không phải là số nguyên tố
    @Test
    public void testNegativeNumbers() {
    	 App PrimeNumberChecker = new App();
        assertFalse(PrimeNumberChecker.isPrime(-5), "-5 không phải là số nguyên tố.");
    }

    // Kiểm tra số lớn hơn
    @Test
    public void testLargePrimeNumber() {
    	 App PrimeNumberChecker = new App();
        assertTrue(PrimeNumberChecker.isPrime(104729), "104729 là số nguyên tố.");
    }

    @Test
    public void testLargeNonPrimeNumber() {
    	 App PrimeNumberChecker = new App();
        assertFalse(PrimeNumberChecker.isPrime(104728), "104728 không phải là số nguyên tố.");
    }
}
