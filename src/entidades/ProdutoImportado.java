package entidades;

public class ProdutoImportado extends Produto {
    private double taxa;

    public ProdutoImportado(String nome, double preco, double v) {
        super(nome, preco);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "ProdutoImportado{" +
                "taxa=" + taxa +
                '}';
    }
}
