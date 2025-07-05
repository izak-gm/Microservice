package tech.izak.Microservice.loanPlan.mapper;

import org.springframework.stereotype.Service;
import tech.izak.Microservice.loanPlan.dto.LoanPlanRecord;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;

@Service
public class LoanPlanMapper {
  public LoanPlan toLoanplan(LoanPlanRecord record){
    return LoanPlan.builder()
          .id(record.id())
          .fine(record.fine())
          .processingFee(record.processingFee())
          .durationInDays(record.durationInDays())
          .repaymentCycles(record.repaymentCycle())
          .build();
  }
}
