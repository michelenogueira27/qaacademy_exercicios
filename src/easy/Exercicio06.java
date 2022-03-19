package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        String nota1Digitado = JOptionPane.showInputDialog("Digite a primeira nota");
        String nota2Digitado = JOptionPane.showInputDialog("Digite a segunda nota");

        nota1 = Double.parseDouble(nota1Digitado);
        nota2 = Double.parseDouble(nota2Digitado);

        media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.println("Aprovado");
        }

        if (media < 5) {
            System.out.println("Reprovado");

        }
        if (media == 5) {
            System.out.println("Exame");

        }

    }

}
