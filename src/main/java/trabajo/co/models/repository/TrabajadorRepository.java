package trabajo.co.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trabajo.co.models.entity.Trabajador;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {

}
