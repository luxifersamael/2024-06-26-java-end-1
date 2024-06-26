package es1;
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
        System.out.println();
        
    }

    /* Questo metodo scorre l'array delle prenotazioni e se c'è un posto disponibil
     * lo prenota e restituisce true, altrimenti restituisce false 
     * poiché non ci sono posti disponibili 
     */
    public boolean prenota() {
        for (int i = 0; i < posti.length; i++) {
            if (!posti[i]) {
                posti[i] = true;
                System.out.println("Prenotato posto " + i);
                return true;
            }
        }
        System.out.println("Nessun posto disponibile");
        return false;
    }

    /* Questo metodo mi permette di annullare una prenotazione, 
     * prende in input il posto da annullare e se il posto è prenotato lo annulla
     * verifica anche che il posto in input sia un valore valido ossia,
     * verifica che sia compreso tra 0 e la lunghezza dell'array delle prenotazioni
     */

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

    /* Il metodo 'disponibili' prende in input un intero che rappresenta il numero di posti da voler controllare,
     * quindi viene fatto scorrere l'array delle prenotazioni e si contano i posti disponibili
     * se il numero di posti disponibili è maggiore o uguale al numero di posti da prenotare
     * allora stampa il numero di posti disponibili, altrimenti stampa che non ci sono abbastanza posti disponibili
     */

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
