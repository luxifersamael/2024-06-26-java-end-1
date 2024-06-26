/* * ES5: Sistema di Votazione
* 
* Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
* Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
* ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
* doppi voti o voti a candidati non esistenti.
*/

public class Candidato {
    private String nome;

    public Candidato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}