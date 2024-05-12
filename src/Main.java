import animal.*;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", 7);
        Cavalo cavalo = new Cavalo("Spirit", 8);
        Preguica preguica = new Preguica("Sid", 5);
        Leao leao = new Leao("Alex", 10);
        Macaco macaco = new Macaco("Bob", 11);
        Cachorro cachorrao = new Cachorro("Bidu", 4);
        Cavalo ponei = new Cavalo("Bolt", 15);
        Preguica preguica1 = new Preguica("Mel", 17);
        Leao leao1 = new Leao("Felix", 21);
        //TODO: caso queira adicionar o último animal:
        // Macaco macaco1 = new Macaco("Tom", 25);

        //-------> 2 <---------//
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        //------------> 3 <-------------//
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        //-------------> 4 <---------------//
        Zoologico zoologico = new Zoologico(10);
        zoologico.adicionarAnimal(0, cachorro);
        zoologico.adicionarAnimal(1, cavalo);
        zoologico.adicionarAnimal(2, preguica);
        zoologico.adicionarAnimal(3, leao);
        zoologico.adicionarAnimal(4, macaco);
        zoologico.adicionarAnimal(5, cachorrao);
        zoologico.adicionarAnimal(6, ponei);
        zoologico.adicionarAnimal(7, preguica1);
        zoologico.adicionarAnimal(8, leao1);
        //TODO: zoologico.adicionarAnimal(9, macaco1);
        zoologico.visitarJaulas();
    }
}