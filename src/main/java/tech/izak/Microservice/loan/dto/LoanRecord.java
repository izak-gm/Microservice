package tech.izak.Microservice.loan.dto;


import java.util.Date;

public record LoanRecord(Integer principleAmount,
                         Double outstandingAmount,
                         Double initialAmount,
                         Double repaymentCycleAmount,
                         String loanCode,
                         Date applicationDate,
                         Long loanPlanId,
                         Long admin,
                         Long creditOfficer,
                         Long client){ }
