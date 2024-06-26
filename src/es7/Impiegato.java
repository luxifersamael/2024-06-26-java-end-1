package es7;

/*ES7: Impiegato e Manager
     * 
     * Crea una classe Impiegato con attributi come nome, salario e metodi per
     * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
     * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
     * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
     * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
     * Impiegato.
     *  */
public class Impiegato {

    public String nome;
    public double salario;

    public Impiegato(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // metodo per aumentare il salario in base alla percentuale
    public void aumentaSalario(int percentuale) {
        salario += salario * percentuale / 100;
    }

    @Override
    public String toString() {
        return nome + ", salario=" + salario;
    }

}
