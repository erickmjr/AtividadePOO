package Questao1;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private final int matricula;
    private final LocalDate dataContratacao;
    private double salario;
    private double salarioBase;
    private double horasTrabalhadas;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = LocalDate.now();
        this.matricula = geraMatricula++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCPF() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRG() {
        return rg;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getMatricula() {
        return geraMatricula;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void calculaSalario() {
        Calculo calculo = new Calculo();
        calculo.calcularSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("RG: " + getRG());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Data de contratação: " + getDataContratacao());
        System.out.println("Salário total: " + salario);
        System.out.println("Horas trabalhadas: " + getHorasTrabalhadas());
    }


}
