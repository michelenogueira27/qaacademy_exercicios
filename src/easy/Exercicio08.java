package easy;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public double calcularImpostoDeRenda(double salario) {
        double ir = 0;
        if (salario > 0 && salario <= 1903.98) {
            System.out.println("Isento de imposto de renda");
        }
        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }
        return ir;
    }
        public double calcularSalarioLiquido(double salario, double imposto, double inss) {
            return salario - imposto - inss;

    }
}
