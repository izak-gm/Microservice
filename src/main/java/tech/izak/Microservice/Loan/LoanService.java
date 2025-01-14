package tech.izak.Microservice.Loan;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoanService {

  public final LoanRepository loanRepository;

  public LoanService(LoanRepository loanRepository) {
    this.loanRepository = loanRepository;
  }

  public LoanDto applyLoan(@RequestBody LoanDto loanDto){
    Loan loan=new Loan();
    loan.setPrincipleAmount(loanDto.getPrincipleAmount());
    loan.setLoanTypeId(loanDto.getLoanTypeId());
    loan.setProcessingFee(loanDto.getProcessingFee());
    loan.setOutstandingBalance(loanDto.getOutstandingBalance());
    loan.setLoanStatus(loanDto.getLoanStatus());

    LoanService loanService = new LoanService(loanRepository);
    LoanDto appliedLoan = loanService.applyLoan(loanDto);


//    double interest =loanService.calculateLoanInterest(appliedLoan.getPrincipleAmount());

    loanRepository.save(loan);
    return loanDto;
  }

  public double calculateLoanInterest(Integer principalAmount, double annualInterestRate, int loanTenureYears) {
    // Simple interest formula: Interest = (Principal * Rate * Time) / 100
    return (principalAmount * annualInterestRate * loanTenureYears) / 100;
  }}
