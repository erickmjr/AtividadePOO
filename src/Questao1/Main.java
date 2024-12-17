package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite o nome do funcionário: ");
            String nomeFuncionario = scanner.nextLine();

            System.out.println("Digite o CPF do funcionario: ");
            String cpfFuncionario = scanner.nextLine();

            System.out.println("Digite o RG do funcionário: ");
            String rgFuncionario = scanner.nextLine();

            System.out.println("Digite o salário base do funcionário: ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário: ");
            double horasTrabalhadas = scanner.nextDouble();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(nomeFuncionario, salarioBase, horasTrabalhadas);
            funcionario.setCpf(cpfFuncionario);
            funcionario.setRg(rgFuncionario);

            funcionario.calculaSalario();
            funcionario.imprimirDados();

            System.out.println("Digite 'sim' para cadastrar outro funcionário.");
            resposta = scanner.nextLine();
            scanner.close();
        } while (resposta.equalsIgnoreCase("sim"));
    }
}
