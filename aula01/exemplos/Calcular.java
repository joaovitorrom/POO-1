public class Calcular{
	public static void main(String arg[]) { // String arg[] é um vetor chamado arg que recebe uma string inteira em cada posição
        String frase0 = arg[0]; // vai armazenar a diretriz de execução
        String frase1 = arg[1]; // vai armazenar a diretriz de execução
        System.out.println("\nFrase1: " + frase0 + " " + frase1);
    }
    
    public static void calc(int a, int b) {
        System.out.println("\n Soma: " + (a+b));
    }
}

