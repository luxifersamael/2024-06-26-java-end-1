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
public class Manager extends Impiegato {

    private double bonus;

    public Manager(String nome, double salario, double bonus) {
        super(nome, (salario + bonus));
        this.bonus = bonus;

    }

    @Override
    public void aumentaSalario(int percentuale) {
        // riassegno salario in modo tale da dimostrare il funzionamento del
        // polimorfismo latebinding ma avrei
        // potuto usare lo stesso metodo derivato senza fare l'override poiché bonus
        // lo aggiungo già al salario stesso nel costruttore
        super.salario -= this.bonus;
        super.salario += (salario * percentuale / 100) + bonus;
    }

    @Override
    public String toString() {
        return super.nome + " bonus = " + bonus + ", " + super.toString();
    }

}
