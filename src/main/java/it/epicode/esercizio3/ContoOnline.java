package it.epicode.esercizio3;

import it.epicode.exceptions.BancaExceptions;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo +
                " - Num movimenti: " + nMovimenti +
                " - Massimo movimenti: " + maxMovimenti +
                " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws  BancaExceptions {
        if (x > maxPrelievo) {
            throw new BancaExceptions("Il prelievo non è disponibile: supera il limite massimo di " + maxPrelievo);
        }
        super.preleva(x);
    }
}


