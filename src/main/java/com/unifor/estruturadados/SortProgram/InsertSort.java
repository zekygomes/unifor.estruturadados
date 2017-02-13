package com.unifor.estruturadados.SortProgram;

public class InsertSort {
	
	
	public static Object [] sort(Object []obj){

		for (int j = 1; j < obj.length; j++) {
			Integer i = j - 1;
			Object k = obj[j];	
			
			while (k.toString().compareTo(obj[i].toString()) <= 0 && i >= 0 ){
				obj[i+1] = obj[i];
				
				i--;
			}
			obj[i+1] = k;
			
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Object [] objeto = new Object[]{'f','f','b','a','c','g','d'};
		Object [] resultado;
		
		resultado = sort(objeto);
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado [i].toString());
		}
		
	}
	
	
}
