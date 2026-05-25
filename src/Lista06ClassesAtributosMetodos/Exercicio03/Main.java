package Lista06ClassesAtributosMetodos.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Post postagem = new Post("Cortinthians é campeão do Paulistão 2025!!", "www.facebook/corinthians.com");

        postagem.curtir();
        postagem.curtir();
        postagem.curtir();
        postagem.curtir();
        postagem.curtir();
        postagem.compartilhar();
        postagem.compartilhar();
        postagem.compartilhar();

        System.out.println("Texto do post: " + postagem.texto);
        System.out.println("Link do post: " + postagem.link);
        System.out.println("Número de curtidas: " + postagem.curtidas);
        System.out.println("Número de compartilhamentos: " + postagem.compartilhamentos);
    }
}
