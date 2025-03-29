package br.com.api.vagacerta.service;

import br.com.api.vagacerta.dto.request.EstablishmentRequestDTO;
import br.com.api.vagacerta.dto.response.EstablishmentResponseDTO;
import br.com.api.vagacerta.model.Address;
import br.com.api.vagacerta.model.Establishment;
import br.com.api.vagacerta.repository.EstablishmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstablishmentService {

    @Autowired
    private EstablishmentRepository repository;

    public EstablishmentResponseDTO create(EstablishmentRequestDTO dto) {
        Establishment establishment = new Establishment();
        BeanUtils.copyProperties(dto, establishment);

        establishment.setCarVacanciesAvailable(establishment.getCarVacancies());
        establishment.setMotorcycleVacanciesAvailable(establishment.getMotorcycleVacancies());

        return new EstablishmentResponseDTO(repository.save(establishment));
    }
}
