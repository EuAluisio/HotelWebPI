package br.com.hotel.service;

import br.com.hotel.model.Reserva;
import br.com.hotel.repository.ReservaRepository;

public class ReservaService {
    private ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public void criarReserva(Reserva reserva) {
        validarDatas(reserva);
        repository.salvar(reserva);
    }

    private void validarDatas(Reserva reserva) {
        if (reserva.getEntrada().isAfter(reserva.getSaida())) {
            throw new IllegalArgumentException("Data de entrada não pode ser após a saída.");
        }
    }
}