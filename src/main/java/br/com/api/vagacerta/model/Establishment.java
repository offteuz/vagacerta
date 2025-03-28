package br.com.api.vagacerta.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "ESTABLISHMENT")
public class Establishment {

    @Id
    @SequenceGenerator(name = "seq_establishment", sequenceName = "seq_establishment", allocationSize = 1)
    @GeneratedValue(generator = "seq_establishment", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cnpj;

    @Column(name = "state_registration", unique = true)
    private String stateRegistration;

    private String telephone;

    @Column(name = "car_vacancies")
    private int carVacancies;

    @Column(name = "car_vacancies_available")
    private int carVacanciesAvailable;

    @Column(name = "motorcycle_vacancies")
    private int motorcycleVacancies;

    @Column(name = "motorcycle_vacancies_available")
    private int motorcycleVacanciesAvailable;

    @Embedded
    private Address address;

    @Embedded
    private Audit audit;

    @OneToMany(mappedBy = "establishment")
    private List<Vehicle> vehicles;
}
