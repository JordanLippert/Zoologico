package animal;

public class Leao extends Animal {

    public Leao(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("ROARRR");
    }

    @Override
    public void realizarComportamento() {
        correr();
    }

    @Override
    public void correr() {
        System.out.println("O leão " + nome + " começou à correr e quer te comer, CORRA!");
    }

    @Override
    public void escalar(){}
}
