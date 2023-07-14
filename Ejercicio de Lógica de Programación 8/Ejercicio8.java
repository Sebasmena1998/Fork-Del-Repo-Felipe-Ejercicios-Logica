
package ejercicioLogicaDeProgramacion;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creamos un Scanner para solicitar los 10 valores
		 Scanner scanner = new Scanner(System.in);
//		 Se hace un array de 10 valores
	        int[] numeros = new int[10];
	        int indicePrimos = 0;

	       
// Solicitar al usuario 10 números y almacenarlos en un array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese su numero  " + (i + 1) + " : ");
	            numeros[i] = scanner.nextInt();
	        }

// Con un ciclo for, se van a acomodar los valores que son primos y
	        for (int i = 0; i < numeros.length; i++) {
	            if (esPrimo(numeros[i])) {
	                int temp = numeros[indicePrimos];
	                numeros[indicePrimos] = numeros[i];
	                numeros[i] = temp;
	                indicePrimos++;
	            }
	        }

// Imprimimos los Arrays que sean primos.
	        System.out.println("\nArray con los números primos al inicio:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }

// Con esta funcion verificaremos que los numeros que se ingresaron en el array sean primos
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	
	}


