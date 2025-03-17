package it.epicode.esercizio3;

import it.epicode.exceptions.BancaExceptions;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaExceptions {
        if (saldo - x < 0) {
            throw new BancaExceptions("Il conto è in rosso");
        }

        if (nMovimenti < maxMovimenti) {
            saldo -= x;
        } else {
            saldo -= (x + 0.50);
        }
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}






