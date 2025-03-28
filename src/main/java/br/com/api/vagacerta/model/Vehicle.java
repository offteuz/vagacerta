package br.com.api.vagacerta.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "VEHICLE")
public class Vehicle {

    @Id
    @SequenceGenerator(name = "seq_vehicle", sequenceName = "seq_vehicle", allocationSize = 1)
    @GeneratedValue(generator = "seq_vehicle", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String mark;

    private String model;

    private String color;

    @Column(unique = true)
    private String plate;

    private char parked;

    @Column(name = "date_time_entry")
    private LocalDateTime dateTimeEntry;

    @Column(name = "date_time_exit")
    private LocalDateTime dateTimeExit;

    @ManyToOne
    @JoinColumn(name = "establishment_id")
    @JsonIgnore
    private Establishment establishment;

    @ManyToOne
    @JoinColumn(name = "type_vehicle_id")
    @JsonIgnore
    private TypeVehicle typeVehicle;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonIgnore
    private Owner owner;

    @Embedded
    private Audit audit;
}
