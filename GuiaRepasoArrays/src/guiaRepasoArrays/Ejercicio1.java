/* 1. Escribir una función que reciba un número n y devuelva true si n es primo o false en caso contrario. */

package guiaRepasoArrays;

public class Ejercicio1 {
	
	int numero;
	
	public Ejercicio1(int numero) {
		this.numero = numero;
	}
	
	public boolean esPrimo(){
		
		for(int i = 2; i <= numero/2; i++ ) {
			if(numero % i == 0) return false;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		
		Ejercicio1 primernumero = new Ejercicio1(2);
        System.out.println("¿El número 2 es primo?: " + primernumero.esPrimo());


		Ejercicio1 segundonumero = new Ejercicio1(4);
        System.out.println("¿El número 4 es primo?: " + segundonumero.esPrimo());


		Ejercicio1 tercernumero = new Ejercicio1(3);
        System.out.println("¿El número 3 es primo?: " + tercernumero.esPrimo());

		Ejercicio1 cuartonumero = new Ejercicio1(6);
		System.out.println("¿El número 6 es primo?: " + cuartonumero.esPrimo());
		
	}

}