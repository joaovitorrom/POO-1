/* 
Exemplo de classe com atributos e métodos estáticos
Atributos e métodos estáticos pertencem à classe e não a instâncias específicas da classe.
Isso significa que eles podem ser acessados sem criar um objeto da classe.
 
Exemplo de uso:
 
 public class Pessoa {
    static int cpf = 0;
    static String nome = "";

    public static void main(String arg[]) {

        entDados(10, "Daniel");
        impDados();
    }

    public static void entDados(int a, String b) {
        cpf = a;
        nome = b;
    }

    public static void impDados() {
        System.out.println("\nCPF: " + cpf);
        System.out.println("NOME: " + nome);
    }
} 
*/

public class Pessoa {
    int cpf = 0;
    String nome = "";

    public static void main(String arg[]) {

        Pessoa p1; // Declara o objeto p1 da classe Pessoa
        p1 = new Pessoa(); // Instancia o objeto p1 da classe Pessoa

        Pessoa p2 = new Pessoa(); // Instancia o objeto p2 da classe Pessoa

        p1.entDados(34, "Adonai");
        p2.entDados(61, "Emet");
        
        p1.impDados();
        p2.impDados();
    }

    public void entDados(int a, String b) {
        cpf = a;
        nome = b;
    }

    public void impDados() {
        System.out.println("\nCPF: " + cpf);
        System.out.println("NOME: " + nome);
    }
} 