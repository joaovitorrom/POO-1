public class Calcular {
    public static void main(String arg[]) {
        String val1 = arg[0];
        String val2 = arg[1];

        int z = Integer.parseInt(val1);
        int w = Integer.parseInt(val2);
        System.out.println("\nValor de z:"+ z);
        System.out.println("\nValor de w:"+ w);
        System.out.println("\nSoma:"+ (z+w));
        System.out.println("\nSubtracao:"+(z-w));
        System.out.println("\nMultiplicacao:"+(z*w));
        System.out.println("\nDivisao:"+ (z/w));
    }
}
