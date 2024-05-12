package animal;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("IIIRRRRÍ");
    }

    @Override
    public void realizarComportamento() {
        correr();
    }

    @Override
    public void correr() {
        System.out.println("O cavalo " + nome + " começou à correr!");
    }

    @Override
    public void escalar(){}
}
