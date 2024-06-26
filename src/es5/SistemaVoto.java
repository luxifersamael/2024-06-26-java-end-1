/* * ES5: Sistema di Votazione
* 
* Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
* Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
* ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
* doppi voti o voti a candidati non esistenti.
*/

import java.util.HashMap;
import java.util.Map;

public class SistemaVoto {
    private Map<Candidato, Integer> voti = new HashMap<>();
    private Map<String, Candidato> candidatiRegistrati = new HashMap<>();

    /*
     * Questo metodo prende in input un candidato e lo aggiunge alla mappa dei voti
     * e alla mappa dei candidati registrati
     * 
     */
    public SistemaVoto() {

    }
    public void aggiungiCandidato(Candidato candidato) {
        voti.put(candidato, 0);
        candidatiRegistrati.put(candidato.getNome(), candidato);
    }


    /* Questo metodo prende in input un elettore e il nome del candidato
     * se il candidato esiste allora incrementa il numero di voti
     * altrimenti lancia un'eccezione
     */
    public void registraVoto(Elettore elettore, String nomeCandidato) {
        Candidato candidato = candidatiRegistrati.get(nomeCandidato);
        if (candidato != null) {
            voti.put(candidato, voti.get(candidato) + 1);
            System.out.println("Voto registrato.");
        } else {
            throw new IllegalArgumentException("Candidato non esistente.");
        }
    }

    public void stampaRisultati() {
        System.out.println(voti);
    }
}
