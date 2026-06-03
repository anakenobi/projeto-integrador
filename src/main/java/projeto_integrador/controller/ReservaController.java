package projeto_integrador.controller;

import org.springframework.web.bind.annotation.*;
import projeto_integrador.model.Reserva;
import projeto_integrador.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva) {
        return reservaService.salvar(reserva);
    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarTodas();
    }
}