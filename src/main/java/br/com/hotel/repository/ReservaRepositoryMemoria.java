
package br.com.hotel.repository;

import br.com.hotel.model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaRepositoryMemoria implements ReservaRepository {
    private List<Reserva> reservas = new ArrayList<>();

    @Override
    public void salvar(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public List<Reserva> listar() {
        return reservas;
    }
}