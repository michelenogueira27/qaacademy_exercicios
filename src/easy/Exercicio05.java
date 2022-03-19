package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double numero1,numero2, numero3;
        double soma,subtracao,multiplicacao,media;

        String numero1Digitado = JOptionPane.showInputDialog("Digite o primeiro numero");
        String numero2Digitado = JOptionPane.showInputDialog("Digite o segundo numero");
        String numero3Digitado = JOptionPane.showInputDialog("Digite o terceiro numero");

        numero1= Double.parseDouble(numero1Digitado);
        numero2= Double.parseDouble(numero2Digitado);
        numero3= Double.parseDouble(numero3Digitado);

        soma= numero1 + numero2 + numero3;
        subtracao = numero1 - numero2 - numero3;
        multiplicacao = numero1 * numero2 * numero3;
        media = (soma)/3;

        System.out.println("A soma dos numeros digitados é:" + soma);
        System.out.println("A subtração dos numeros digitados é:" + subtracao);
        System.out.println("A multiplicação dos numeros digitados é:" + multiplicacao);
        System.out.println("A média dos numeros digitados é:" + media);



        
        



    }
    
}
