package entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date data;

    public ProdutoUsado(String nome, double preco, Date data) {
        super(nome, preco);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ProdutoUsado{" +
                "data=" + data +
                '}';
    }
}
