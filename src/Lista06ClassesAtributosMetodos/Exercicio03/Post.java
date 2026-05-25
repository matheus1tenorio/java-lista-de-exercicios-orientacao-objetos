package Lista06ClassesAtributosMetodos.Exercicio03;

public class Post {
    String texto;
    String link;
    int curtidas;
    int compartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.curtidas = 0;
        this.compartilhamentos = 0;
    }

    public void curtir() {
        this.curtidas += 1;
    }

    public void compartilhar() {
        this.compartilhamentos += 1;
    }
}
