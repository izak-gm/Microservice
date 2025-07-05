package tech.izak.Microservice.loan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.izak.Microservice.loan.dto.LoanRecord;
import tech.izak.Microservice.loan.service.LoanService;

@RestController
@RequestMapping( "api/v1/loan")
@RequiredArgsConstructor
public class LoanController {

  public final LoanService loanService;

 @PostMapping("apply")
  public LoanRecord applyLoan(@RequestBody LoanRecord loanRecord){
    return loanService.applyLoan(loanRecord);
  }
}
