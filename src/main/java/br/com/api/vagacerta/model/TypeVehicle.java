package br.com.api.vagacerta.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "TYPE_VEHICLE")
public class TypeVehicle {

    @Id
    @SequenceGenerator(name = "seq_type_vehicle", sequenceName = "seq_type_vehicle", allocationSize = 1)
    @GeneratedValue(generator = "seq_type_vehicle", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String description;

    @Embedded
    private Audit audit;

    @OneToMany(mappedBy = "typeVehicle")
    private List<Vehicle> vehicles;
}
