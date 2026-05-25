package Lista06ClassesAtributosMetodos.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(123, "Joao Silva", "10/10/2002", "Masculino", "SUS", "pelo de gato", "A+");

        System.out.println("Codigo do Paciente: " + paciente.codigo);
        System.out.println("Nome: " + paciente.nome);
        System.out.println("Data de Nascimento: " + paciente.dataNascimento);
        System.out.println("Sexo: " + paciente.sexo);
        System.out.println("Plano de Saúde: " + paciente.planoSaude);
        System.out.println("Alergia: " + paciente.alergia);
        System.out.println("Tipo Sanguineo: " + paciente.tipoSanguineo);

        System.out.println("-------------------------------------------------------");

        paciente.planoSaude = "Hapvida";
        paciente.alergia = "dipirona, paracetamol e ibuprofeno";

        System.out.println("Codigo do Paciente: " + paciente.codigo);
        System.out.println("Nome: " + paciente.nome);
        System.out.println("Data de Nascimento: " + paciente.dataNascimento);
        System.out.println("Sexo: " + paciente.sexo);
        System.out.println("Plano de Saúde: " + paciente.planoSaude);
        System.out.println("Alergia: " + paciente.alergia);
        System.out.println("Tipo Sanguineo: " + paciente.tipoSanguineo);
    }
}
