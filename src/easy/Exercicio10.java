package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros = 0.05, valorJuros = 0, valorTotal, i = 1;
        String investimentoDigitado = JOptionPane.showInputDialog("Digite o valor do seu salario");
        valorInvestimento = Double.parseDouble(investimentoDigitado);
        while (i <= 10) {
            valorJuros = (valorInvestimento * taxaJuros) + valorJuros;
            i = i + 1; // i++

        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Você investiu: " + valorInvestimento);
        System.out.println("Rendeu : " + valorJuros + "de Juros");
        System.out.println("O Valor total são : " + valorTotal);

    }

}
