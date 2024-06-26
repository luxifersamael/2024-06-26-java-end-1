import java.util.ArrayList;

public class Studenti {
    /*
     * * ES2: Registro Studenti
     * 
     * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
     * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
     * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
     * per evitare errori nell'inserimento dei voti.
     */
    private String nome;
    private String matricola;
    private ArrayList<Integer> voti;


    
    public Studenti(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
    }

    /* Il metodo addVoto prende in input un voto, se questo è minore di 18 allora lancia un'eccezione
     * poiché 18 è il voto minimo, se il voto è maggiore di 30
     * lancia un'altra eccezione poiché non è possibile aggiungere un voto maggiore di 30
     * se il voto è valido viene aggiunto alla lista dei voti
     */
    public void addVoto(int voto) {
        if (voto < 18) {
            throw new IllegalArgumentException("Impossibile aggiungere il voto poiché non si è superati la prova");
        }
        if (voto > 30) {
            throw new IllegalArgumentException("Impossibile aggiungere il voto poiché maggiore di 30");
        }
        voti.add(voto);
    }

    /* il metodo media controlla prima cosa se c'è almeno un voto,
     * se non ci sono voti allora lancia un'eccezione, altrimenti
     * calcola la media dei voti e la restituisce
     */
    public double media() {
        if (voti.isEmpty()) {
            throw new IllegalStateException("Non ci sono voti per calcolare la media");
        }
        int sum = 0;
        for (int voto : voti) {
            sum += voto;
        }
        return (double) sum / voti.size();
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricola: " + matricola);
        System.out.println("Voti: " + voti);
        System.out.println("Media: " + media());
    }

}
