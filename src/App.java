import es1.Prenotazioni;
import es2.Studenti;
import es3.Simulatore;
import es4.Contatto;
import es4.Elenco;
import es5.Candidato;
import es5.Elettore;
import es5.SistemaVoto;

public class App {
    /**
     * TODO:
     * 
     * ES0: Creare un repository su GitHub con il seguente nome:
     * 2024-06-26-java-end-1
     * 
     * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
     * 
     * 
     * ES1: Sistema di Prenotazioni
     * 
     * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
     * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
     * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
     * Implementa metodi per prenotare un posto, annullare la prenotazione e
     * verificare se un o piu' posti sono disponibili.
     * 
     * ---------------------------------------------------------------------------
     * 
     * ES2: Registro Studenti
     * 
     * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
     * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
     * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
     * per evitare errori nell'inserimento dei voti.
     * 
     * ---------------------------------------------------------------------------
     * 
     * ES3: Simulatore di Banca
     * 
     * Definisci una classe ContoBancario con metodi per depositare denaro,
     * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
     * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
     * 
     * ---------------------------------------------------------------------------
     * 
     * ES4: Elenco Telefonico
     * 
     * Implementa una classe Contatto che rappresenti un contatto telefonico con
     * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
     * gestisca una
     * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
     * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
     * telefono non validi.
     * 
     * * ES5: Sistema di Votazione
     * 
     * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
     * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
     * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
     * doppi voti o voti a candidati non esistenti.
     */
    public static void main(String[] args) throws Exception {

        // test esercizio 1
        System.out.println("\n--------------------\n");
        System.out.println("Test esercizio 1\n");
        Prenotazioni teatro = new Prenotazioni(10);
        teatro.prenota();
        teatro.prenota();
        teatro.prenota();
        teatro.annulla(1);
        teatro.disponibili(2);
        teatro.disponibili(12);
        System.out.println("\n--------------------\n");

        // test esercizio 2
        System.out.println("Test esercizio 2\n");

        Studenti studente = new Studenti("Mario Esposito", "0124002729");
        studente.addVoto(30);
        studente.addVoto(18);
        try {
            studente.print();
            studente.addVoto(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n--------------------\n");

        // test esercizio 3
        System.out.println("Test esercizio 3\n");
        Simulatore conto = new Simulatore(1000);
        try {
            conto.deposita(100);
            conto.preleva(200);
            conto.preleva(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n--------------------\n");

        // test esercizio 4
        System.out.println("Test esercizio 4\n");
        Elenco elenco = new Elenco();

        Contatto contatto1 = null;
        Contatto contatto2 = null;
        Contatto contatto3 = null;

        try {
            contatto1 = new Contatto("Mario", "3331234567");
            contatto2 = new Contatto("Luca", "3331234568");
            contatto3 = new Contatto("Nicola", "333123456");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        elenco.aggiungiContatto(contatto1);
        elenco.aggiungiContatto(contatto2);
        elenco.rimuoviContatto(contatto1);
        try {
            elenco.cercaContatto("Mario");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n--------------------\n");


        //test esercizio 5
        SistemaVoto sistema = new SistemaVoto();
        Candidato candidato1 = new Candidato("Mario");
        Candidato candidato2 = new Candidato("Luca");
        Candidato candidato3 = new Candidato("Nicola");
        Elettore elettore1 = new Elettore("Pasquale");
        Elettore elettore2 = new Elettore("Giovanni");
        Elettore elettore3 = new Elettore("Ciro");
        Elettore elettore4 = new Elettore("Gioacchino");
        Elettore elettore5 = new Elettore("Giovanni");
        Elettore elettore6 = new Elettore("Riccardo");

        sistema.aggiungiCandidato(candidato1);
        sistema.aggiungiCandidato(candidato2);
        sistema.aggiungiCandidato(candidato3);
        
        try {
            sistema.registraVoto(elettore1, "Nicola");
            sistema.registraVoto(elettore2, "Luca");
            sistema.registraVoto(elettore3, "Luca");
            sistema.registraVoto(elettore4, "Nicola");
            sistema.registraVoto(elettore5, "Nicola");
            sistema.registraVoto(elettore6, "Carmine");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sistema.stampaRisultati();

        System.out.println("\n--------------------\n");


    }
}
