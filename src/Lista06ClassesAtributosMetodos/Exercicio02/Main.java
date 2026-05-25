package Lista06ClassesAtributosMetodos.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 777, "apartamento", "Bairro da Alegeria", "Cidade da Paz", "SP", "12345-678");
        Medico medico = new Medico(123, "Maria Helena", "Feminino", "Pediatra", endereco);

        endereco.rua = "Rua do Amor";
        endereco.numero = 999;
        medico.especialidade = "Clínico";

        System.out.println("Dados do Médico:");
        System.out.println("Código: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);

        System.out.println(" ");

        System.out.println("Endereço do Médico:");
        System.out.println("Rua: " + medico.endereco.rua);
        System.out.println("Número: " + medico.endereco.numero);
        System.out.println("Complemento: " + medico.endereco.complemento);
        System.out.println("Bairro: " + medico.endereco.bairro);
        System.out.println("Cidade: " + medico.endereco.cidade);
        System.out.println("UF: " + medico.endereco.uf);
        System.out.println("CEP: " + medico.endereco.cep);
    }
}
