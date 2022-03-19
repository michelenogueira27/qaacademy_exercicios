package easy;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        double salario, INSS;
        String salarioDigitado = JOptionPane.showInputDialog("Digite o valor do seu salario");
        salario = Double.parseDouble(salarioDigitado);

        if (salario <= 1045.00) {
            INSS = salario * 0.075;
            System.out.println("O Valor INSS será" + INSS);
        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            INSS = salario * 0.9;
            System.out.println("O Valor INSS será" + INSS);
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            INSS = salario * 0.12;
            System.out.println("O Valor INSS será" + INSS);
        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            INSS = salario * 0.14;
            System.out.println("O Valor INSS será" + INSS);
        }
        if (salario >= 6101.07) {
            INSS = 854.15;
            System.out.println("O Valor INSS será" + INSS);
        }
    }

}
