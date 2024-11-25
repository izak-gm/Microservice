package tech.izak.Microservice.Employee.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ProfilePicture")
public class EmployeeProfilePic {
    @Id
    @SequenceGenerator(
            name =  "profile_picture_sequence",
            sequenceName = "profile_picture_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "profile_picture_sequence"
    )
    @Column(name = "id_profile_picture")
    private Integer idProfilePicture;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

    @Column(name = "data")
    @Lob
    @JdbcTypeCode(Types.BINARY)
    private byte[] data;

    @JsonIgnore
    @OneToOne(mappedBy = "profilePicture", fetch = FetchType.LAZY)
    private Employee employee;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
