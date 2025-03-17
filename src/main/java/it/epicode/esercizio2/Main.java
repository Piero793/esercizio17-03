package it.epicode.esercizio2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(it.epicode.esercizio1.Main.class.getName());

        Scanner scanner = new Scanner(System.in);
        while (true)
            try {
                System.out.println("Inserisci la distanza percorsa in km: ");
                double distanza = scanner.nextDouble();
                logger.info("distanza inserita: {}", distanza);

                System.out.println("Inserisci il consumo di combustibile in litri: ");
                double consumo = scanner.nextDouble();
                logger.info("consumo inserito: {}", consumo);
                if (consumo == 0) {
                    System.out.println("Il consumo di combustibile non puo essere 0");
                    logger.debug("errore nel consumo");
                    continue;
                }
                ;
                double KmLitro = distanza / consumo;
                System.out.println("hai percorso " + KmLitro + " " + "km");


            } catch (Exception e) {
                System.out.println("errore");
                scanner.close();
            }

    }


}

