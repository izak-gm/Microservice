package tech.izak.Microservice.loanPlan.dto;

import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;

public record LoanPlanRecord(Long id,
                             Integer durationInDays,
                             Integer processingFee,
                             String name,
                             Double fine,
                             RepaymentCycle repaymentCycle
                             ) {

}
