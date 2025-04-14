public class TstPes {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa();

        p1.setCpf(82);
        p1.setNome("Teste");
        p1.getEnder().setRua(); // Reflexividade
        p1.getEnder().setRua(); // Reflexividade


        System.out.println("\nCPF.:" + p1.getCpf());
        System.out.println("\nNOME.:" + p1.getNome());
        System.out.println("\nRUA.:" + p1.getEnder().getRua()); // Reflexividade
        System.out.println("\nNUMERO.:" + p1.getEnder().getNum()); // Reflexividade
    }
}
