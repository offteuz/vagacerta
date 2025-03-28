package br.com.api.vagacerta.repository;

import br.com.api.vagacerta.model.Establishment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {
}
