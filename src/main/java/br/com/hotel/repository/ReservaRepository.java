package br.com.hotel.repository;

// 1. Imports no topo do arquivo
import br.com.hotel.model.Reserva;
import java.util.List;

/**
 * @author EU
 */
// 2. Declaração apenas da interface (sem "class")
public interface ReservaRepository {
    void salvar(Reserva reserva);
    List<Reserva> listar();
}