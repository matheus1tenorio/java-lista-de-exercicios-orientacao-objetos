package Lista08HerancaPolimorfismo.Exercicio03;

public class Cachorro extends Animal{

    public Cachorro(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public void emitirSom() {
        System.out.println("Au Au");
    }
}
