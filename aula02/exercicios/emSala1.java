package aula02.exercicios;
public class emSala1 {
    static int x = 10;
    static int y = 6;

    public static void main(String arg[]) {
        int x = 15;
        int y = 8;

        soma();
        sub();
        mult();
        div();
        System.out.println("\n Soma-main: "+ (x+y));
    }

    public static void soma() {
        System.out.println("\nValor Soma: "+ (x+y));
    }
    public static void sub() {
        System.out.println("\nValor Subtracao: "+ (x-y));
    }
    public static void mult() {
        System.out.println("\nValor Multiplicacao: "+ (x*y));
    }
    public static void div() {
        System.out.println("\nValor Divisao: "+ (x/y));
    }
}
