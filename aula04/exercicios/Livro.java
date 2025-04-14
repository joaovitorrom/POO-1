public class Livro {
    private String nome;
    private String autor;
    Prateleira prat1 = new Prateleira();
    
    public Prateleira getPrat() {
        return prat1; 
    }

    public void setPrat(Prateleira prat1) {
        this.prat1 = prat1;
    }

    public String getNome() { 
        return nome;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}