public class Revista {
    
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDescricao () {
        return this.descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public double getValor () {
        return this.valor;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}