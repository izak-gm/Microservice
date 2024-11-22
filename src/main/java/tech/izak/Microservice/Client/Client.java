package tech.izak.Microservice.Client;

import jakarta.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @SequenceGenerator(
            name =  "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )

    private Integer id;
    private String firstName;

}
