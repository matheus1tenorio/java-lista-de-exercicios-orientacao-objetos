package Lista06ClassesAtributosMetodos.Exercicio02;

public class Medico {
    int codigo;
    String nome;
    String sexo;
    String especialidade;
    Endereco endereco;

    public Medico(int codigo, String nome, String sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
}
