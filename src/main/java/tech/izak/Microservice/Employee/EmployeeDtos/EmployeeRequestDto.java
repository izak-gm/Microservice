package tech.izak.Microservice.Employee.EmployeeDtos;

public class EmployeeRequestDto {
    private String firstName;
    private String middleName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String dob;
    private Long idNumber;
    private String password;
    private Integer role_id;
    private EmployeeProfilePictureDto profilePicture;

    public EmployeeProfilePictureDto getProfilePicture() {
        return profilePicture;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public String getPassword() {
        return password;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }
}
