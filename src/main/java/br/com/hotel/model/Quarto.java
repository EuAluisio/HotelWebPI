
package br.com.hotel.model;

/**
 *
 * @author EU
 */
public class Quarto {
    private String tipo;
    private double preco;

    public Quarto(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return tipo + " - R$ " + preco;
    }
}


