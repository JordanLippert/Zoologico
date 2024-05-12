package animal;

public class Preguica extends Animal {

    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AaAaAa");
    }

    @Override
    public void realizarComportamento() {
        escalar();
    }

    @Override
    public void escalar() {
        System.out.println("A preguiça " + nome + " escalou a árvore e dormiu");
    }

    @Override
    public void correr(){}
}
