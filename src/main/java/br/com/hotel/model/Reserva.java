package br.com.hotel.model;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate entrada;
    private LocalDate saida;

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Quarto getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public LocalDate getEntrada() { return entrada; }
    public void setEntrada(LocalDate entrada) { this.entrada = entrada; }

    public LocalDate getSaida() { return saida; }
    public void setSaida(LocalDate saida) { this.saida = saida; }

    @Override
    public String toString() {
        return "Reserva de " + cliente + " no quarto " + quarto +
               " de " + entrada + " até " + saida;
    }
}