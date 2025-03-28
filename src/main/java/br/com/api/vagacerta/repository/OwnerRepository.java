package br.com.api.vagacerta.repository;

import br.com.api.vagacerta.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
