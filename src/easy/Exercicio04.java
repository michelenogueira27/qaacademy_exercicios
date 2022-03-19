package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero;
        String numeroDigitado = JOptionPane.showInputDialog("Digite um numero");
        numero = Integer.parseInt( numeroDigitado);
        System.out.println("O Resultado:" + numero * 2);
    }

}
