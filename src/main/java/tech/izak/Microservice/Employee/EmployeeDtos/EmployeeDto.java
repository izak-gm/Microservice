package tech.izak.Microservice.Employee.EmployeeDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
        private String firstName;
        private String middleName;
        private String email;
        private String phoneNumber;
        private String gender;
        private String dob;
        private Long idNumber;
        private String password;
        private Integer role_id;

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

        //        private String passportPhoto;
//        private String idPhotoFront;
//        private String idPhotoBack;
}
