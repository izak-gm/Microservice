package tech.izak.Microservice.loanPlan.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.loanPlan.dto.LoanPlanRecord;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;
import tech.izak.Microservice.loanPlan.repository.LoanPlanRepository;
import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;
import tech.izak.Microservice.repayment_cycle.repository.RepaymentCycleRepository;

@Service
@AllArgsConstructor
public class LoanPlanService {
  private final LoanPlanRepository loanPlanRepository;
  private final RepaymentCycleRepository repaymentCycleRepository;

  public LoanPlanRecord createLoanPlan(LoanPlanRecord loanPlanRecord ,Long repaymentCyclesId){
    RepaymentCycle repaymentCycle=repaymentCycleRepository.findById(repaymentCyclesId)
          .orElseThrow(()->new RuntimeException("Repayment Cycle not found with id :"+repaymentCyclesId ));

    LoanPlan loanPlan=new LoanPlan();

    loanPlan.setName(loanPlanRecord.name());
    loanPlan.setFine(loanPlanRecord.fine());
    loanPlan.setProcessingFee(loanPlanRecord.processingFee());
    loanPlan.setDurationInDays(loanPlanRecord.durationInDays());
    loanPlan.setRepaymentCycles(repaymentCycle);

    LoanPlan saveLoanPlan=loanPlanRepository.save(loanPlan);
    return new LoanPlanRecord(
          saveLoanPlan.getDurationInDays(),
          saveLoanPlan.getProcessingFee(),
          saveLoanPlan.getName(),
          saveLoanPlan.getFine()
    );
  }
}
