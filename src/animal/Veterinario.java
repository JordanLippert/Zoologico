package animal;

import animal.interfaces.AnimalFalante;

public class Veterinario {

    public void examinar(Animal animal){
        System.out.println("Examinando o: " +animal.nome);
        animal.emitirSom();
    }
}
