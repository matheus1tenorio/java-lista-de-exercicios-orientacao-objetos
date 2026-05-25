package Lista06ClassesAtributosMetodos.Exercicio04;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Waldir Braz", "123456789-00");
        aluno.notas[0] = 7.5;
        aluno.notas[1] = 8;
        aluno.notas[2] = 6.5;
        aluno.notas[3] = 9;

        System.out.println("A media do aluno é: " + aluno.calcularMedia());
    }
}
