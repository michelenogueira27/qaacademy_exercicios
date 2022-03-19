package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int i = 1, soma,numeroDigitado;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero");
        numeroDigitado= Integer.parseInt(numeroDigitadoStg);
        soma = numeroDigitado;

       while (i <= 100) {
           soma = soma +2;
           System.out.println ("soma");
        i++; // i = i +1;

    }

    }

}
