package Questao1;

public class Calculo {
    private double totalSalario;

    public Calculo() {
        this.totalSalario = 0;
    }

    public void calcularSalario(double salarioBase, double horasTrabalhadas) {
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public double getTotalSalario() {
        return this.totalSalario;
    }

}
