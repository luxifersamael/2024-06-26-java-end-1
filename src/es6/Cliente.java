package es6;
/*     * ES6: Sistema di Prenotazione Hotel
     * 
     * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
     * associare clienti a prenotazioni e una lista di camere disponibili.
     * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
     * assicurandoti di gestire eccezioni come camere non disponibili o
     * cancellazioni tardive. */
public class Cliente {
    String Nome;
    public Cliente(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }
    
}
