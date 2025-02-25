package com.lista_palabra;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListaPalabrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palabras = new TreeSet<>();

        System.out.println("Ingrese palabras (escriba 'salir' para terminar):");

        while (true) {
            String palabra = scanner.nextLine().trim();
            if (palabra.equalsIgnoreCase("salir")) {
                break;
            }
            palabras.add(palabra);
        }

        // Mostrar palabras ordenadas
        System.out.println("\nPalabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Búsqueda de palabra
        System.out.print("\nIngrese una palabra para buscar: ");
        String buscar = scanner.nextLine().trim();
        if (palabras.contains(buscar)) {
            System.out.println("La palabra '" + buscar + "' está en la lista.");
        } else {
            System.out.println("La palabra '" + buscar + "' no se encontró en la lista.");
        }

        scanner.close();
    }
}