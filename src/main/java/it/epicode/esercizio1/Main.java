package it.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class.getName());
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Array iniziale: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("ciclo cominciato");
            try {
                System.out.println("Inserisci un numero (1-10) e la posizione (0-4) [0 per uscire]:");
                int numero = scanner.nextInt();
                logger.info("numero inserito: {}", numero);

                if (numero == 0) {
                    System.out.println("Chiusura del programma.");
                    break;

                }


                int posizione = scanner.nextInt();

                if (posizione < 0 || posizione >= array.length) {
                    System.out.println("Errore: Posizione non valida! Riprova.");
                    logger.debug("posizione non valida: {}", posizione);
                    continue;
                }

                array[posizione] = numero;


                System.out.println("Array aggiornato: " + Arrays.toString(array));

            } catch (Exception e) {
                System.out.println("Errore di input, inserisci solo numeri validi.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

