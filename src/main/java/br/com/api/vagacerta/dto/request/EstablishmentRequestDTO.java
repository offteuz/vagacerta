package br.com.api.vagacerta.dto.request;

import br.com.api.vagacerta.model.Address;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

public record EstablishmentRequestDTO(

        @NotNull
        String name,

        @NotNull
        @CNPJ
        String cnpj,

        @NotNull
        String stateRegistration,

        @NotNull
        String telephone,

        @NotNull
        int carVacancies,

        @NotNull
        int motorcycleVacancies,

        @NotNull
        Address address
) {
}
