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

    public void deposita(int quant) {
        if (quant <= 0) {
            throw new IllegalArgumentException("Impossibile depositare una cifra minore o uguale a 0");
        }
        saldo += quant;
    }

    public void preleva(int quant) {
        if (quant <= 0) {
            throw new IllegalArgumentException("Impossibile prelevare una cifra minore o uguale a 0");
        }
        if (quant > saldo) {
            throw new IllegalStateException("Impossibile prelevare, saldo insufficiente");
        }
        saldo -= quant;
    }

    public int saldo() {
        return saldo;
    }


}
