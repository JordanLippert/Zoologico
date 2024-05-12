package animal;

import animal.interfaces.AnimalCorredor;
import animal.interfaces.AnimalEscalador;
import animal.interfaces.AnimalFalante;

public abstract class Animal implements AnimalFalante, AnimalCorredor, AnimalEscalador {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public abstract void emitirSom();


    public void realizarComportamento(){
        correr();
        escalar();
    };

}
