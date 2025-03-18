/* 3. Escribir una función que reciba un arreglo de enteros y devuelva true si el arreglo
está ordenado de menor a mayor y false si está desordenado. */

package guiaRepasoArrays;

public class Ejercicio3 {

	int arr[];
	
	public Ejercicio3(int[] arr) {
		this.arr = arr;
	}
	
	
	public boolean estaOrdenado() {
		
		for(int i = 0; i < this.arr.length-1; i++) {
			if(this.arr[i] > this.arr[i+1]) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int arreglo1[] = {1,2,3,4,5};
        Ejercicio3 primerarreglo = new Ejercicio3 (arreglo1);
        System.out.println("¿El primer arreglo está ordenado?: " + primerarreglo.estaOrdenado()); //true


		int arreglo2[] = {1,2,4,3,5};
        Ejercicio3 segundoarreglo = new Ejercicio3 (arreglo2);
        System.out.println("¿El segundo arreglo está ordenado?: " + segundoarreglo.estaOrdenado()); //false


        int arreglo3[] = {6,7,8,9,10};
        Ejercicio3 tercerarreglo = new Ejercicio3 (arreglo3);
        System.out.println("¿El tercer arreglo está ordenado?: " + tercerarreglo.estaOrdenado()); //true

        int arreglo4[] = {6,7,9,8,10};
        Ejercicio3 cuartoarreglo = new Ejercicio3 (arreglo4);
		System.out.println("¿El cuarto arreglo está ordenado?: " + cuartoarreglo.estaOrdenado()); //false
		
		
	}
}