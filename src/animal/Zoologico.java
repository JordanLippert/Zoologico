package animal;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico(int numJaulas) {
        jaulas = new Animal[numJaulas];
    }

    public void adicionarAnimal(int indice, Animal animal){
        if(indice >= 0 && indice < jaulas.length){
            jaulas[indice] = animal;
        }
        else {
            System.out.println("Índice inválido para adicionar animal na jaula.");
        }
    }

    public void visitarJaulas(){
        for(int i = 0; i< jaulas.length; i++){
            if (jaulas[i] != null) {
                System.out.println("Jaula: " + (i +1) + ": ");
                jaulas[i].emitirSom();
                if (jaulas[i] instanceof Cachorro || jaulas[i] instanceof Cavalo || jaulas[i] instanceof Preguica || jaulas[i] instanceof Leao || jaulas[i] instanceof Macaco){
                    jaulas[i].realizarComportamento();
                }
            }
            else {
                System.out.println("Jaula " + (i+1) + " está vazia!");
            }
        }
    }
}
