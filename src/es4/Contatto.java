public class Contatto {
    //classe di supporto per l'esercizio 4

    private String nome;
    private String numero;

    public Contatto(String nome, String numero) {
        if (numero.length() != 10) {
            throw new IllegalArgumentException("Il numero di telefono deve essere di 10 cifre");
        }
        this.nome = nome;
        this.numero = numero;
    }

    //metodi get
    
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

}
