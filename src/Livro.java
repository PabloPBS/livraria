public class Livro {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;

    public Livro() {
        System.out.println("Novo livro criado");
    }

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    private boolean temAutor() {
        return this.autor != null;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
