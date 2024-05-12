package animal;

public class Macaco extends Animal  {

    public Macaco(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("U U Á Á");
    }

    @Override
    public void realizarComportamento() {
        correr();
        escalar();
    }

    @Override
    public void correr() {
        System.out.println("O macaco " + nome + " roubou sua banana e começou a correr!");
    }

    @Override
    public void escalar() {
        System.out.println("O macaco " + nome + " escalou a árvore e começou à se balançar");
    }
}
