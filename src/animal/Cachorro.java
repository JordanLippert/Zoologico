package animal;




public class Cachorro extends Animal {

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }

    @Override
    public void realizarComportamento() {
        correr();
    }

    @Override
    public void correr() {
        System.out.println("O cachorro " + nome + " começou à correr!");
    }

    @Override
    public void escalar(){}
}
