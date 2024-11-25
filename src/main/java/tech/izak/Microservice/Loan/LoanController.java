package tech.izak.Microservice.Loan;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "apply/loan")
@RequiredArgsConstructor
public class LoanController {

  public final LoanService loanService;


  @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<LoanDto> applyLoan(@RequestBody LoanDto loanDto){
    LoanDto loandto= new LoanDto();
    loanDto.setPrincipleAmount(loandto.getPrincipleAmount());
    loanDto.setLoanStatus(loandto.getLoanStatus());
    loanDto.setLoanTypeId(loandto.getLoanTypeId());

    return ResponseEntity.ok(loanDto);
  }

}
