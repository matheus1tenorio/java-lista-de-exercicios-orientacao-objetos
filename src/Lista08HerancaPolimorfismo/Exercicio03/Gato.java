package Lista08HerancaPolimorfismo.Exercicio03;

public class Gato extends Animal{

    public Gato(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public void emitirSom() {
        System.out.println("Miau Miau");
    }
}
