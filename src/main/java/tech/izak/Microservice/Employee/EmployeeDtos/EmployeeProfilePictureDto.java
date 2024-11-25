package tech.izak.Microservice.Employee.EmployeeDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeProfilePictureDto {
        private Integer idProfilePicture;
        private String fileName;
        private String fileType;
        private byte[] data;

        public Integer getIdProfilePicture() {
                return idProfilePicture;
        }

        public void setIdProfilePicture(Integer idProfilePicture) {
                this.idProfilePicture = idProfilePicture;
        }

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
}
