package tech.izak.Microservice.Client;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    private Integer role_id;
//    @OneToOne()


    public Client() {
    }

    public Client(Integer id, String firstName, String middleName, String email, String phoneNumber, String gender, LocalDate dob, String passportPhoto, Integer idNumber, String idPhotoFront, String idPhotoBack, Integer role_id) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
        this.passportPhoto = passportPhoto;
        this.idNumber = idNumber;
        this.idPhotoFront = idPhotoFront;
        this.idPhotoBack = idPhotoBack;
        this.role_id = role_id;
    }

    public Client(String firstName, String middleName, String email, String phoneNumber, String gender, LocalDate dob, String passportPhoto, Integer idNumber, String idPhotoFront, String idPhotoBack, Integer role_id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
        this.passportPhoto = passportPhoto;
        this.idNumber = idNumber;
        this.idPhotoFront = idPhotoFront;
        this.idPhotoBack = idPhotoBack;
        this.role_id = role_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdPhotoFront() {
        return idPhotoFront;
    }

    public void setIdPhotoFront(String idPhotoFront) {
        this.idPhotoFront = idPhotoFront;
    }

    public String getIdPhotoBack() {
        return idPhotoBack;
    }

    public void setIdPhotoBack(String idPhotoBack) {
        this.idPhotoBack = idPhotoBack;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", passportPhoto='" + passportPhoto + '\'' +
                ", idNumber=" + idNumber +
                ", idPhotoFront='" + idPhotoFront + '\'' +
                ", idPhotoBack='" + idPhotoBack + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
