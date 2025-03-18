/* 2. Escribir una función que calcule la suma de los múltiplos de 3 y 5,
mayores o iguales que 0 y menores que un parámetro n.

Por ejemplo la llamada:
sumaMultiplos(10); // Devuelve 23 (3+5+6+9)
sumaMultiplos(16); // Devuelve 60 (3+5+6+9+10+12+15) */

package guiaRepasoArrays;

public class Ejercicio2 {

    int num;

    public Ejercicio2(int num) {
        this.num = num;
    }

    public int sumaDe() {
        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        
        Ejercicio2 ejemplo1 = new Ejercicio2(10);
        System.out.println("La suma de los múltiplos de 3 y 5 menores que 10 es: " + ejemplo1.sumaDe());

        Ejercicio2 ejemplo2 = new Ejercicio2(16);
        System.out.println("La suma de los múltiplos de 3 y 5 menores que 16 es: " + ejemplo2.sumaDe());
    }
}