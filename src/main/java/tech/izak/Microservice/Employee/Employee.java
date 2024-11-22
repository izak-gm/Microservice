package tech.izak.Microservice.Employee;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Employee {
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

    @Column(name="id")
    private Integer id;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String firstName;
    @Column(nullable = false,columnDefinition = "text")
    private String middleName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String passportPhoto;
    @Column(nullable = false)
    private Integer idNumber;
    @Column(nullable = false)
    private String idPhotoFront;
    @Column(nullable = false)
    private String idPhotoBack;

    @Column(nullable = false)
    private String password;

    private Integer role_id;

    public Employee() {
    }
}
