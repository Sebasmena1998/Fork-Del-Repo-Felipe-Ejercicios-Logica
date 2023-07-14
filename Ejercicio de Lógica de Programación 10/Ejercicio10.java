package ejercicioLogicaDeProgramacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear el objeto HashMap para almacenar los pares de palabras
        Map<String, String> miniDiccionario = new HashMap<>();

       
        miniDiccionario.put("Reservorio", "Reservoir");
        miniDiccionario.put("Pozo", "Well");
        miniDiccionario.put("Perforación", "Drilling");
        miniDiccionario.put("Refinación", "Refining");
        miniDiccionario.put("Fluidos de perforación", "Drilling fluids");
        miniDiccionario.put("Cabeza de pozo", "Wellhead");
        miniDiccionario.put("Producción", "Production");
        miniDiccionario.put("Permeabilidad", "Permeability");
        miniDiccionario.put("Sísmica", "Seismic");
        miniDiccionario.put("Recursividad", "Recursion");
        miniDiccionario.put("Variable", "Variable");
        miniDiccionario.put("Función", "Function");
        miniDiccionario.put("Clase", "Class");
        miniDiccionario.put("Objeto", "Object");
        miniDiccionario.put("Arreglo", "Array");
        miniDiccionario.put("Ciclo de vida", "Life cycle");
        miniDiccionario.put("Depuración de código", "Code debugging");
        miniDiccionario.put("Herencia", "Inheritance");
        miniDiccionario.put("Bucle", "Loop");
        miniDiccionario.put("Compilación", "Compilation");

        // Obtener 5 palabras al azar del mini diccionario
        String[] palabrasEspanol = miniDiccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        System.out.println("Palabras en español seleccionadas al azar:");

        for (int i = 0; i < 5; i++) {
            int indice = random.nextInt(palabrasEspanol.length);
            String palabraEspanol = palabrasEspanol[indice];
            String palabraIngles = miniDiccionario.get(palabraEspanol);
            System.out.println(palabraEspanol + " - " + palabraIngles);
        }
    }
}

