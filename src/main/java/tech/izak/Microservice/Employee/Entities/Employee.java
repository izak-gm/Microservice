package tech.izak.Microservice.Employee.Entities;

import jakarta.persistence.*;
import tech.izak.Microservice.Loan.Loan;

@Entity
@Table(name = "Employee" )
public class Employee {
    @Id
    @SequenceGenerator(
            name =  "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )

    @Column(name="id")
    private Integer id;
    private String firstName;
    private String middleName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String dob;

    @OneToOne()
    @JoinColumn(name = "id_profile_picture", referencedColumnName = "id_profile_picture")
    private EmployeeProfilePic profilePicture;
    private Long idNumber;
    private String password;
    private Integer role_id;

//    @OneToOne(mappedBy = "userid",fetch = FetchType.LAZY)
//    private Loan loan;

//    private String idPhotoFront;
//    private String idPhotoBack;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String middleName, String email, String phoneNumber, String gender, String dob, String profile_picture, Long idNumber, String idPhotoFront, String idPhotoBack, String password, Integer role_id) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
//        this.passportPhoto = passportPhoto;
        this.idNumber = idNumber;
//        this.idPhotoFront = idPhotoFront;
//        this.idPhotoBack = idPhotoBack;
        this.password = password;
        this.role_id = role_id;
    }

    public Employee(String firstName, String middleName, String email, String phoneNumber, String gender, String dob, Integer profile_picture, Long idNumber, String idPhotoFront, String idPhotoBack, String password, Integer role_id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dob = dob;
        this.idNumber = idNumber;
//        this.idPhotoFront = idPhotoFront;
//        this.idPhotoBack = idPhotoBack;
        this.password = password;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public EmployeeProfilePic getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(EmployeeProfilePic profilePicture) {
        this.profilePicture = profilePicture;
    }

    //    public String getIdPhotoFront() {
//        return idPhotoFront;
//    }
//
//    public void setIdPhotoFront(String idPhotoFront) {
//        this.idPhotoFront = idPhotoFront;
//    }
//
//    public String getIdPhotoBack() {
//        return idPhotoBack;
//    }
//
//    public void setIdPhotoBack(String idPhotoBack) {
//        this.idPhotoBack = idPhotoBack;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", idNumber=" + idNumber +
//                ", idPhotoFront='" + idPhotoFront + '\'' +
//                ", idPhotoBack='" + idPhotoBack + '\'' +
                ", password='" + password + '\'' +
                ", role_id=" + role_id +
                '}';
    }


}
