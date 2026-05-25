package Lista06ClassesAtributosMetodos.Exercicio04;

public class Aluno {
    String nome;
    String cpf;
    double[] notas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this. cpf = cpf;
        this.notas = new double[4];
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }
}
