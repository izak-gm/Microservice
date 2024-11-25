package tech.izak.Microservice.Loan;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanService {

  public final LoanRepository loanRepository;

  public LoanDto applyLoan(LoanDto loanDto){
    Loan loan=new Loan();
    loan.setLoanTypeId(loanDto.getLoanTypeId());
    loan.setPrincipleAmount(loan.getPrincipleAmount());
    loan.setProcessingFee(loan.getProcessingFee());
    loan.setOutstandingBalance(loan.getOutstandingBalance());
    loan.setLoanStatus(loan.getLoanStatus());

    loanRepository.save(loan);
    return loanDto;
  }
}
