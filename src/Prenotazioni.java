public class Prenotazioni {
    /*
     * ES1: Sistema di Prenotazioni
     * 
     * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
     * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
     * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
     * Implementa metodi per prenotare un posto, annullare la prenotazione e
     * verificare se un o piu' posti sono disponibili.
     */

    private boolean[] posti;

    public Prenotazioni(int size) {
        posti = new boolean[size];
    }

    public void prenota() {
        for (int i = 0; i < posti.length; i++) {
            if (!posti[i]) {
                posti[i] = true;
                System.out.println("Prenotato posto " + i);
                return;
            }
        }
        System.out.println("Nessun posto disponibile");
    }

    public void annulla(int posto) {
        if (posto < 0 || posto >= posti.length) {
            System.out.println("Posto non valido");
            return;
        }
        if (posti[posto]) {
            posti[posto] = false;
            System.out.println("Annullata prenotazione posto " + posto);
        } else {
            System.out.println("Posto non prenotato");
        }
    }

    public void disponibili(int postiDaPrenotare) {
        int count = 0;
        for (int i = 0; i < posti.length; i++) {
            if (!posti[i]) {
                count++;
            }
        }
        if (postiDaPrenotare <= count) {
            System.out.println("Ci sono " + count + " posti disponibili");
        } else {
            System.out.println("Non ci sono abbastanza posti disponibili");
            
        }
    }

}
