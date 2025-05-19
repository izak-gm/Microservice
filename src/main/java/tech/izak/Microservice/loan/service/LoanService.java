package tech.izak.Microservice.loan.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tech.izak.Microservice.loan.enity.Loan;
import tech.izak.Microservice.loan.dto.LoanDto;
import tech.izak.Microservice.loan.repository.LoanRepository;

@Service
public class LoanService {

  public final LoanRepository loanRepository;

  public LoanService(LoanRepository loanRepository) {
    this.loanRepository = loanRepository;
  }

  public LoanDto applyLoan(@RequestBody LoanDto loanDto){
    Loan loan=new Loan();

    loanRepository.save(loan);
    return loanDto;
  }

  public double calculateLoanInterest(Integer principalAmount, double annualInterestRate, int loanTenureYears) {
    return (principalAmount * annualInterestRate ) / 100;
  }}
