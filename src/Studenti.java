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

    public void addVoto(int voto) {
        if (voto < 18 || voto > 30) {
            throw new IllegalArgumentException("Impossibile aggiungere il voto poiché non è compreso tra 18 e 30");
        }
        voti.add(voto);
    }

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
