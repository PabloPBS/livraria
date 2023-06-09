public class LivroFisico extends Livro implements Promocional {
    
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no LivroFisico");
        return true;
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.05;
    }
}
