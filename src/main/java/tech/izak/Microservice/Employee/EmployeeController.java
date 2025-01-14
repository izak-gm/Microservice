package tech.izak.Microservice.Employee;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tech.izak.Microservice.Employee.EmployeeDtos.EmployeeDto;
import tech.izak.Microservice.Employee.EmployeeDtos.EmployeeRequestDto;

import java.io.IOException;

@RestController
@RequestMapping(path = "api/v1/registration")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<EmployeeRequestDto> createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto,
                                                             @RequestPart MultipartFile profilePicture) throws IOException{
        EmployeeDto employeeDto=new EmployeeDto();
//        employeeDto.setFirstName(firstName);
//        employeeDto.setMiddleName(middleName);
//        employeeDto.setEmail(email);
//        employeeDto.setPhoneNumber(phoneNumber);
//        employeeDto.setGender(gender);
//        employeeDto.setDob(dob);
//        employeeDto.setIdNumber(idNumber);
//        employeeDto.setPassword(password);
//        employeeDto.setRole_id(role_id);

        return ResponseEntity.ok(employeeService.createEmployee(employeeDto,profilePicture));
    }
}
