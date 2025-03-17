package it.epicode.esercizio3;

import it.epicode.exceptions.BancaExceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContoCorrente cc = new ContoCorrente("Giuseppe", 1000.0);
        ContoOnline co = new ContoOnline("Giuseppe", 1000.0, 500.0);
        logger.info("conti istanziati correttamente");

        // Chiedere all'utente di effettuare prelievi fino a scatenare un'eccezione
        while (true) {
            System.out.println("Inserisci il prelievo: ");
            double prelievo = scanner.nextDouble();
            logger.info("prelievo inserito: {}", prelievo);

            try {
                cc.preleva(prelievo);
                co.preleva(prelievo);
                System.out.println("Saldo rimanente: " + cc.restituisciSaldo());
            } catch (BancaExceptions e) {
                System.out.println("Errore: " + e.getMessage());
                logger.debug("errore nel prelievo");
                break;
            }
        }

        scanner.close();
        System.out.println("Operazioni concluse.");
    }
}
