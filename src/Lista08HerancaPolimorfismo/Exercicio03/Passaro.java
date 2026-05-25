package Lista08HerancaPolimorfismo.Exercicio03;

public class Passaro extends Animal{

    public Passaro(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public void emitirSom() {
        System.out.println("Bem-ti-vi");
    }
}
