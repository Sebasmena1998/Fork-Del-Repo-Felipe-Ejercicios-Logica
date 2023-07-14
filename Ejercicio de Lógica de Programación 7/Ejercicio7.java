package ejercicioLogicaDeProgramacion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido al tiempo faltante para el fin de semana");
		System.out.println("En que día de la semana se encuentra:");
		System.out.println("1.- Lunes 2.- Martes 3.-Miercoles 4.-Jueves 5.-Viernes");
		byte eleccion1= scanner.nextByte();

		System.out.println("Ingrese la hora en que se encuentra");
		byte hora = scanner.nextByte();

		System.out.println("Ingrese los minutos en los que se encuentra");
		byte minutos = scanner.nextByte();
		
		String diaString=null;
		int dia = 0;
		int restante=1;
		int tiempoFaltante = 6660;
		int diasFaltantes=0;
		
		if (eleccion1==1) {
			 diaString = "Lunes";
			 diasFaltantes=4;
		}else if (eleccion1==2) {
			diaString = "Martes";		
			diasFaltantes=3;
		}else if (eleccion1==3) {
			diaString = "Miercoles";			
			diasFaltantes=2;
		}else if (eleccion1==4) {
			diaString = "Jueves";			
			diasFaltantes=1;
		}else if (eleccion1==5) {
			diaString = "Viernes";			
			diasFaltantes=0;
		}else {
			System.out.println("Ya es fin de semana no te preocupes");
		}
		
		if (eleccion1==5 && hora<15) {
			System.out.println("Ya es fin de semana no te preocupes");
		}else if (hora>25 && minutos > 60) {
			System.err.println("Hora invalida intente de nuevo");
		}
		
		int horasParaMediaNoche = 24-hora;
		int minutosParaLaHora = 60-minutos;
		
		
		
		
		
		
		

		
		
		System.out.println("Usted se encuentra en: " + diaString + " y son las: " + hora + ":" + minutos+ " hrs.");
		System.out.println("Entonces le faltan: "+ restante + " minutos para el fin de semana.");
		
		scanner.close();

	}

}
