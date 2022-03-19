package medium;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int fatorial, i;
        String fatorialstg = JOptionPane.showInputDialog("Digite um numero");
        fatorial = Integer.parseInt(fatorialstg);
        i = fatorial;

        while (i > 1) {

            fatorial = fatorial * (i - 1);
            i--;
        }
        System.out.println("O fatorial do número digitado é " + fatorial);
    }

}
