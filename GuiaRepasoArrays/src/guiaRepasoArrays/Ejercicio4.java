/* 4. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los elementos
que se encuentran en posiciones pares (incluido el elemento de la posición 0).

Por ejemplo:
Dado el arreglo [1, 2, 13 ,4, 8, 6] devuelve 22 (1+13+8) */

package guiaRepasoArrays;

public class Ejercicio4 {
	
	int arr[];
	
	public Ejercicio4(int[] arr) {
		this.arr = arr;
	}
	
	public int sumaElementosPares () {
		int suma = 0;
		for (int i = 0; i < arr.length; i = i+2) {
			suma += arr[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		int arreglo1[] = {1,2,13,4,8,6};
		Ejercicio4 primerarreglo = new Ejercicio4(arreglo1);
		System.out.println("La suma de los elementos en posiciones pares es: " + primerarreglo.sumaElementosPares());
		
		int arreglo2[] = {1,2,3,4,5,6};
		Ejercicio4 segundoarreglo = new Ejercicio4(arreglo2);
		System.out.println("La suma de los elementos en posiciones pares es: " + segundoarreglo.sumaElementosPares());

        int arreglo3[] = {9,5,7,22,44,9};
		Ejercicio4 tercerarreglo = new Ejercicio4(arreglo3);
		System.out.println("La suma de los elementos en posiciones pares es: " + tercerarreglo.sumaElementosPares());
		
	}
}