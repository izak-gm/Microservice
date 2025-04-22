package tech.izak.Microservice.Loan;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "loan")
public class LoanController {

  public final LoanService loanService;

  public LoanController(LoanService loanService) {
    this.loanService = loanService;
  }

 @PostMapping("apply")
  public LoanDto applyLoan(@RequestBody LoanDto loanDto){
//    LoanDto loandto= new LoanDto();
//    loanDto.setPrincipleAmount(loandto.getPrincipleAmount());
//    loanDto.setOutstandingBalance(loanDto.getOutstandingBalance());
//    loanDto.setUserid(loanDto.getUserid());
//    loanDto.setLoanStatus(loandto.getLoanStatus());
//    loanDto.setLoanTypeId(loandto.getLoanTypeId());
//
    return loanService.applyLoan(loanDto);
//    return ResponseEntity.ok(loanService.applyLoan(loanDto));
  }

}
