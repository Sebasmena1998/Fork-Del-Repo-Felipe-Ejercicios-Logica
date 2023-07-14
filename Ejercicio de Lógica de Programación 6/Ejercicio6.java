package ejercicioLogicaDeProgramacion;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su palabra o frase:");
		String frase = scanner.nextLine();
		scanner.close();
		
		StringBuilder stringBuilder = new StringBuilder(frase);
		
		String invertido = stringBuilder.reverse().toString();
		System.out.println("La frase original es " + frase);
		System.out.println("La frase invertida es " + invertido);
	}

}
