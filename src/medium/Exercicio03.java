package medium;

public class Exercicio03 {
    public static void main(String[] args) {
        double i = 0, soma=1;
        while (i <= 1000) {
            soma = i + soma;

            if (soma >= 1500) {
                break; // parar
            }
            System.out.println(soma);
            i++; // i = i+1;
        }

    }

}
