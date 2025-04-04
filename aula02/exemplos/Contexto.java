public class Contexto {
    public static void main(String arg[]) {
        String val1 = arg[0];
        String val2 = arg[1];

        int x = Integer.parseInt(val1);
        int y = Integer.parseInt(val2);
        calc(x,y);
    }


    public static void calc(int x, int y) {
        System.out.println("\nValor de z:"+ x);
        System.out.println("\nValor de w:"+ y);
        System.out.println("\nSoma:"+ (x+y));
        System.out.println("\nSubtracao:"+(x-y));
        System.out.println("\nMultiplicacao:"+(x*y));
        System.out.println("\nDivisao:"+ (x/y));
    }
}
