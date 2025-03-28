package br.com.api.vagacerta.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "OWNER")
public class Owner {

    @Id
    @SequenceGenerator(name = "seq_owner", sequenceName = "seq_owner", allocationSize = 1)
    @GeneratedValue(generator = "seq_owner", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String cpf;

    private String cnpj;

    private String telephone;

    @Embedded
    private Address address;

    @Embedded
    private Audit audit;

    @OneToMany(mappedBy = "owner")
    private List<Vehicle> vehicles;
}
