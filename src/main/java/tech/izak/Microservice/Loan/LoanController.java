package tech.izak.Microservice.Loan;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
