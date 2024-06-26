package es3;
public class Simulatore {
    /**
     * ES3: Simulatore di Banca
     * 
     * Definisci una classe ContoBancario con metodi per depositare denaro,
     * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
     * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
     */

    private int saldo;

    public Simulatore(int saldo) {
        this.saldo = saldo;
    }

    /* il metodo deposita prende in input la quantità di denaro da depositare,
     * se la quantità è minore o uguale a 0 lancia un'eccezione, altrimenti
     * aggiunge la quantità al saldo del conto
     */
    public void deposita(int quant) {
        if (quant <= 0) {
            throw new IllegalArgumentException("Impossibile depositare una cifra minore o uguale a 0");
        }
        saldo += quant;
        System.err.println("Desposito effettuato di " + quant + " euro");
    }

    /* il metodo preleva prende in input la quantità di denaro da prelevare
     * se la quantità è minore o uguale a 0 lancia un'eccezione, se la quantità
     * è maggiore del saldo lancia un'altra eccezione, altrimenti sottrae la quantità
     * al saldo del conto
     */
    public void preleva(int quant) {
        if (quant <= 0) {
            throw new IllegalArgumentException("Impossibile prelevare una cifra minore o uguale a 0");
        }
        if (quant > saldo) {
            throw new IllegalStateException("Impossibile prelevare, saldo insufficiente");
        }
        saldo -= quant;
        System.out.println("Prelevamento effettuato di " + quant + " euro");
    }

    /* il metodo saldo restituisce il saldo del conto */
    public int saldo() {
        return saldo;
    }


}
