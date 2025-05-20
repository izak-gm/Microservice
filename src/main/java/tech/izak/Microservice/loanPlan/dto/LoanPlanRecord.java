package tech.izak.Microservice.loanPlan.dto;

public record LoanPlanRecord(Integer durationInDays,
                             Integer processingFee,
                             String name,
                             Double fine
                             ) {
}
