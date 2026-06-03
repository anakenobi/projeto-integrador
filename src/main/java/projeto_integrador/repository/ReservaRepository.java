package projeto_integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_integrador.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}