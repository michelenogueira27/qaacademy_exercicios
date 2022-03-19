package medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] vetorAlunos;
        vetorAlunos = new String[5];
        int[] vetorNumeroAlunos;
        vetorNumeroAlunos = new int[5];
        int i = 0;

        while (i <= 4) {
            vetorAlunos[i] = JOptionPane.showInputDialog("Digite seu nome");
            String vetorNumeroAlunosStg = JOptionPane.showInputDialog("Digite seu numero de identificação");
            vetorNumeroAlunos[i] = Integer.parseInt(vetorNumeroAlunosStg);

            i++;
        }

        i = 0; // Reset do valor da variável

        while (i <= 4) {
            System.out.println(vetorAlunos[i]);
            System.out.println(vetorNumeroAlunos[i]);
            i++;

        }

    }

}
