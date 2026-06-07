package projeto_integrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.String)
    private TipoReserva tipoReserva; //mesa ou ambiente

    @Enumerated(EnumType.String)
    private StatusReserva status = StatusReserva.PENDENTE; //pendente, confirmada ou cancelada

    private String tipoEvento; //apenas para reserva de ambiente

    private String decoracao; // apenas para reserva de ambiente ambiente

    private String nomeCliente;

    private String telefone;

    private LocalDate data;

    private LocalTime horario;

    private Integer quantidadePessoas;

    public enum TipoReserva {
        MESA, AMBIENTE
    }

    public enum StatusReserva {
        PENDENTE, CONFIRMADA, CANCELADA
    }
}