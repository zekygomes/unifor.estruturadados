package com.unifor.estruturadados.SortProgram;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertSort {

	@Test
	public void test() {
		
		Object [] objeto = new Object[]{36,46,44,46,28,52,29};
		Object [] result = new Object[]{28,29,36,44,46,46,52};
		
		InsertSort.sort(objeto);
		
			
		assertArrayEquals(objeto, result);
			
		fail();
	}

}
