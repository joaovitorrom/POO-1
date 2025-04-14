public class TstLivro {
    public static void main (String args[]) {
        Livro l1 = new Livro();

        l1.setNome("1984");
        l1.setAutor("George Orwell");
        l1.getPrat().setId(01);
        l1.getPrat().setGenero("Filosofia");


        System.out.println("O nome do livro eh: " + l1.getNome());
        System.out.println("O nome do autor eh: " + l1.getAutor());
        System.out.println("O ID da prateleira eh: " + l1.getPrat().getId());
        System.out.println("O genero da prateleira eh: " + l1.getPrat().getGenero());
    }
}
