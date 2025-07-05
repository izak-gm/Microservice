package tech.izak.Microservice.loanPlan.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.loanPlan.dto.LoanPlanRecord;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;
import tech.izak.Microservice.loanPlan.repository.LoanPlanRepository;
import tech.izak.Microservice.loanPlan.mapper.LoanPlanMapper;
import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;
import tech.izak.Microservice.repayment_cycle.repository.RepaymentCycleRepository;

@Service
@AllArgsConstructor
public class LoanPlanService {
  private final LoanPlanRepository loanPlanRepository;
  private LoanPlanMapper mapper;

  public LoanPlanRecord createLoanPlan(LoanPlanRecord record){
    LoanPlan saveLoanPlan=loanPlanRepository.save(mapper.toLoanplan(record));
    return new LoanPlanRecord(
          saveLoanPlan.getId(),
          saveLoanPlan.getDurationInDays(),
          saveLoanPlan.getProcessingFee(),
          saveLoanPlan.getName(),
          saveLoanPlan.getFine(),
          saveLoanPlan.getRepaymentCycles()
    );
  }
}
