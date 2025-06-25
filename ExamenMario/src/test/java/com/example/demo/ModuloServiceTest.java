package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.service.ModuloService;

public class ModuloServiceTest {
	  private final ModuloService service = new ModuloService();

	    @Test
	    void testBasicCase() {
	        assertEquals(12339, service.calculate(7, 5, 12345));
	    }

	    @Test
	    void testZeroY() {
	        assertEquals(0, service.calculate(5, 0, 4));
	    }

	    @Test
	    void testEqualToN() {
	        assertEquals(15, service.calculate(10, 5, 15));
	    }

	    @Test
	    void testLargeValues() {
	        assertEquals(999999995, service.calculate(10, 5, 1000000000));
	    }
}
