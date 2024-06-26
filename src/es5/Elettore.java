package es5;
/* * ES5: Sistema di Votazione
* 
* Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
* Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
* ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
* doppi voti o voti a candidati non esistenti.
*/

public class Elettore {
    private String nome;
    private boolean haVotato = false;

    public Elettore(String nome) {
        this.nome = nome;
    }

    /*
     * Questo metodo prende in input il nome del candidato e il sistema di voto
     * e registra il voto dell'elettore
     * se l'elettore ha già votato lancia un'eccezione
     * altrimenti registra il voto e setta haVotato a true
     * se invece il nome del candidatore è errato lancia un'eccezione
     * e non registra il voto e continua a far votare l'elettore
     */
    public void vota(String nomeCandidato, SistemaVoto sistemaVoto) throws Exception {
        if (!haVotato) {
            try {
                sistemaVoto.registraVoto(this, nomeCandidato);
                haVotato = true;
                System.out.println("Voto registrato.");
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Candidato non esistente.");
            }

        } else {
            throw new IllegalArgumentException("L'elettore ha già votato.");
        }
    }

    public String getNome() {
        return nome;
    }
}