package br.com.hotel.main;

import br.com.hotel.model.Cliente;
import br.com.hotel.model.Quarto;
import br.com.hotel.model.Reserva;
import br.com.hotel.repository.ReservaRepository;
import br.com.hotel.repository.ReservaRepositoryMemoria;
import br.com.hotel.service.ReservaService;
import java.time.LocalDate;

/**
 *
 * @author EU
 */
public class Main {
    public static void main(String[] args) {
        ReservaRepository repo = new ReservaRepositoryMemoria();
        ReservaService service = new ReservaService(repo);

        Cliente cliente = new Cliente("Aluísio", "alu@example.com");
        Quarto quarto = new Quarto("Suíte Master", 500);

        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setQuarto(quarto);
        reserva.setEntrada(LocalDate.of(2026, 9, 15));
        reserva.setSaida(LocalDate.of(2026, 9, 20));

        service.criarReserva(reserva);

        System.out.println("Reservas cadastradas: " + repo.listar().size());
        System.out.println(repo.listar().get(0));
    }
}