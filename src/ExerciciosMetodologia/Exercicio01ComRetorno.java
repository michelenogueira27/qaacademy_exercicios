package ExerciciosMetodologia;

public class Exercicio01ComRetorno {
    public static void main(String[] args) {

        String metodoUm = verificarMetodoUm();
        System.out.println(metodoUm);
        String metodoDois = verificarMetodoDois();
        System.out.println(metodoDois);
        String metodoTres = verificarMetodoTres();
        System.out.println(metodoTres);
        String metodoQuatro = verificarMetodoQuatro();
        System.out.println(metodoQuatro);
        String metodoCinco = verificarMetodoCinco();
        System.out.println(metodoCinco);
    }

    public static String verificarMetodoUm() {
        return "Utilize o metodoUm";

    }

    public static String verificarMetodoDois() {
        return "Utilize o metodoDois";

    }

    public static String verificarMetodoTres() {

        return "Utilize o metodoTres";

    }

    public static String verificarMetodoQuatro() {

        return "Utilize o metodoQuatro";

    }

    public static String verificarMetodoCinco() {

        return "Utilize o metodoCinco";

    }
}
