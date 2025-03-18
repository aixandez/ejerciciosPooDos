/* 10. Escribir una función consonantes que recibe una cadena de caracteres y devuelve
la cadena que resulta de eliminar todas las vocales de la cadena recibida.

Por ejemplo:
consonantes("hola como estas"); // devuelve "hl cm sts" */

package guiaRepasoArrays;

public class Ejercicio10 {

    String texto;

    public Ejercicio10(String texto){
        this.texto = texto;
    }
    public String eliminarvocales() {
        return this.texto.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        
        Ejercicio10 primerafrase = new Ejercicio10("Hola como estas");
        System.out.println(primerafrase.eliminarvocales());
    }

}
