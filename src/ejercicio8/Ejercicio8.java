//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        double nota;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una nota entre 1 y 10: ");
        nota = leer.nextDouble();
      
        while(nota < 0 || nota > 10){
            System.out.print("Error, la nota no está entre 0 y 10, vuelva a ingresar la nota: ");
            nota = leer.nextDouble();
        }
        
        System.out.println("La nota está entre 1 y 10");
    }
    
}
