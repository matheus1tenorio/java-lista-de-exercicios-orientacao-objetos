package Lista08HerancaPolimorfismo.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", "Masculino", 8);
        Gato gato = new Gato("Felina", "Feminino", 12);
        Passaro passaro = new Passaro("Tuco", "Masculino", 2);

        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
    }
}
