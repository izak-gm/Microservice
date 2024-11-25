package tech.izak.Microservice.Employee;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tech.izak.Microservice.Employee.EmployeeDtos.EmployeeDto;
import tech.izak.Microservice.Employee.EmployeeDtos.EmployeeProfilePictureDto;
import tech.izak.Microservice.Employee.EmployeeDtos.EmployeeRequestDto;
import tech.izak.Microservice.Employee.Entities.Employee;
import tech.izak.Microservice.Employee.Entities.EmployeeProfilePic;

import java.io.IOException;
import java.util.List;

import static java.util.UUID.randomUUID;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private ObjectMapper objectMapper;

    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }

    public EmployeeRequestDto createEmployee(EmployeeDto employeeDto , MultipartFile profilePicture ) throws IOException {

        Employee employee = objectMapper.convertValue(employeeDto,Employee.class);
        EmployeeProfilePic picture=new EmployeeProfilePic();

        picture.setFileName(randomUUID().toString());
        picture.setFileType(profilePicture.getContentType());
        picture.setData(profilePicture.getBytes());

        employee.setProfilePicture(picture);

        employeeRepository.save(employee);

        return objectMapper.convertValue(employee, EmployeeRequestDto.class);
    }
}
