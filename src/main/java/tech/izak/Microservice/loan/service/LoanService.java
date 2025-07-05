package tech.izak.Microservice.loan.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.User.entity.User;
import tech.izak.Microservice.loan.enity.Loan;
import tech.izak.Microservice.loan.dto.LoanRecord;
import tech.izak.Microservice.loan.repository.LoanRepository;

import java.util.Date;

@Service
@AllArgsConstructor
public class LoanService {

  public final LoanRepository loanRepository;

  public LoanRecord applyLoan(LoanRecord loanRecord) {

    Loan loan = new Loan();
    loan.setPrincipleAmount(loanRecord.principleAmount());
    loan.setOutstandingAmount(loanRecord.outstandingAmount());
    loan.setInitialAmount(loanRecord.initialAmount());
    loan.setRepaymentCycleAmount(loanRecord.repaymentCycleAmount());
    loan.setLoanCode(loanRecord.loanCode());
    loan.setApplicationDate(loanRecord.applicationDate());
    loan.setLoanPlans(loan.getLoanPlans());
    loan.setAdmin(loan.getAdmin());
    loan.setClient(loan.getClient());
    loan.setCreditOfficer(loan.getCreditOfficer());

    loanRepository.save(loan);
    return loanRecord;
  }
}
