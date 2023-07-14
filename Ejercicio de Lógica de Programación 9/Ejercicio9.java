package ejercicioLogicaDeProgramacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés utilizando un HashMap
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Pozo", "well");
        diccionario.put("Perforar", "drill");
        diccionario.put("Aceite", "oil");
        diccionario.put("Terminacion", "Completions");
        diccionario.put("Registros", "Log");
        diccionario.put("Yacimiento", "Field");
        diccionario.put("Cementacion", "Cementing");
        diccionario.put("Bomba", "Pump");
        diccionario.put("Porosidad", "Porosity");
        diccionario.put("Permeabilidad", "Permeability");
        diccionario.put("Algoritmo", "Algorithm");
        diccionario.put("Clase", "Class");
        diccionario.put("bucle", "Loop");
        diccionario.put("Paquete", "Package");
        diccionario.put("Objeto", "Object");
        diccionario.put("nube", "cloud");
        diccionario.put("Funcion", "Function");
        diccionario.put("Polimorfismo", "Polymorphism");
        diccionario.put("Compilador", "Compiler");
        diccionario.put("Desarrollador", "Developer");

        // Solicitar una palabra en español al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabra = scanner.nextLine();

        // Buscar la traducción en el diccionario y mostrarla por consola
        String traduccion = diccionario.get(palabra);
        if (traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("No se encontró traducción para la palabra ingresada.");
        }
    }
}

