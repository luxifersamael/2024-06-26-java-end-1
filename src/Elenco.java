import java.util.ArrayList;

public class Elenco {
    /*
     * * ES4: Elenco Telefonico
     * 
     * Implementa una classe Contatto che rappresenti un contatto telefonico con
     * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
     * gestisca una
     * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
     * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
     * telefono non validi.
     */
    ArrayList<Contatto> elenco = new ArrayList<>();

    public Elenco() {
        elenco = new ArrayList<>();
    }

    /*
     * Questo metodo prende in input un oggetto di tipo Contatto e,
     * lo aggiunge all'elenco dei contatti
     */

    public void aggiungiContatto(Contatto contatto) {
        elenco.add(contatto);
        System.out.println("Contatto aggiunto con successo: " + contatto.getNome() + " " + contatto.getNumero());
    }

    /*
     * Questo metodo prende in input un oggetto di tipo Contatto e,
     * lo rimuove dalla lista dei contatti
     * se non lo trovo nella lista lancia un'eccezione
     * 
     */
    public void rimuoviContatto(Contatto contatto) {

        if (elenco.contains(contatto)) {
            System.out.println("Contatto rimosso con successo: " + contatto.getNome() + " " + contatto.getNumero());
            elenco.remove(contatto);
        } else {

            throw new IllegalArgumentException("Contatto non presente");
        }
    }

    /*
     * Questo metodo prende in input un nome
     * e cerca questo nome tra la lista dei contatti
     * se viene trovato allora viene restituito il contatto
     * altrimenti viene restituito un valore nullo
     */
    public Contatto cercaContatto(String nome) {
        for (Contatto contatto : elenco) {
            if (contatto.getNome() == nome) {
                System.out.println("Contatto trovato: " + contatto.getNome() + " " + contatto.getNumero());
                return contatto;
            }
        }
        System.out.println("Contatto non trovato");
        return null;
    }

}
