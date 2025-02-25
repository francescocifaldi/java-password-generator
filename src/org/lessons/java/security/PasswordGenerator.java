package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        String name = scanner.nextLine();
        System.out.println("Inserisci il cognome: ");
        String lastName = scanner.nextLine();
        System.out.println("Inserisci il colore: ");
        String colour = scanner.nextLine();
        System.out.println("Inserisci il giorno in cui sei nato: ");
        int day = scanner.nextInt();
        System.out.println("Inserisci il mese in cui sei nato: ");
        int month = scanner.nextInt();
        System.out.println("Inserisci l'anno in cui sei nato: ");
        int fullYear = scanner.nextInt();

        String password = name + lastName + colour + (day + month + fullYear);
        scanner.close();
        System.out.println("La tua password è: " + password);
    }

}
