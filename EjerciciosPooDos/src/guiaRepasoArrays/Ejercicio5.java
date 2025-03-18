/* 5. Escribir una función que reciba dos matrices de NxN y devuelva la suma de las mismas.
Podemos considerar que las matrices se representan como un arreglo bidimensional. */

package guiaRepasoArrays;

public class Ejercicio5 {
    private int[][] matriz;

    public Ejercicio5(int[][] matriz) {
        this.matriz = matriz;
    }

    public Ejercicio5 sumar(Ejercicio5 otra) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }

        return new Ejercicio5(resultado);
    }

    // Método para imprimir la matriz
    public void imprimirMatriz() {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = {{5, 6}, {7, 8}};
        int[][] matriz2 = {{1, 1}, {1, 1}};

        Ejercicio5 m1 = new Ejercicio5(matriz1);
        Ejercicio5 m2 = new Ejercicio5(matriz2);

        Ejercicio5 resultado = m1.sumar(m2);

        System.out.println("Matriz resultante:");
        resultado.imprimirMatriz();
    }
}
