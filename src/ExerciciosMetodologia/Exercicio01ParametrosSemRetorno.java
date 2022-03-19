package ExerciciosMetodologia;

public class Exercicio01ParametrosSemRetorno {
    public static void main(String[] args) {
        nomePaciente("Michele");
        sobrenome("Nogueira");
        idade("24");
        altura("1,65");
        peso("65");
    }

    public static void nomePaciente(String Nome) {
        System.out.println(Nome);
      
    }

    public static void sobrenome(String sobrenome) {
        System.out.println(sobrenome);
    }

    public static void idade (String idade) {
        System.out.println(idade);

    }
    public static void altura(String altura) {
        System.out.println(altura);

    }
    public static void peso(String peso) {
        System.out.println(peso);

    }


}
