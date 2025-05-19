package tech.izak.Microservice.loan.controller;

import org.springframework.web.bind.annotation.*;
import tech.izak.Microservice.loan.dto.LoanDto;
import tech.izak.Microservice.loan.service.LoanService;

@RestController
@RequestMapping( "loan")
public class LoanController {

  public final LoanService loanService;

  public LoanController(LoanService loanService) {
    this.loanService = loanService;
  }

 @PostMapping("apply")
  public LoanDto applyLoan(@RequestBody LoanDto loanDto){
    return loanService.applyLoan(loanDto);
  }
}
