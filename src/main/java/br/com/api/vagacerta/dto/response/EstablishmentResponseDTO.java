package br.com.api.vagacerta.dto.response;

import br.com.api.vagacerta.model.Address;
import br.com.api.vagacerta.model.Audit;
import br.com.api.vagacerta.model.Vehicle;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;

public record EstablishmentResponseDTO(

        Long id,

        String name,

        String cnpj,

        String stateRegistration,

        String telephone,

        int carVacancies,

        int carVacanciesAvailable,

        int motorcycleVacancies,

        int motorcycleVacanciesAvailable,

        Address address,

        Audit audit,

        List<Vehicle> vehicles
) {
}
