package tech.izak.Microservice.loanPlan.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.izak.Microservice.loanPlan.dto.LoanPlanRecord;
import tech.izak.Microservice.loanPlan.service.LoanPlanService;

@Controller
@AllArgsConstructor
@RequestMapping("api/v1/loan-plan")
public class LoanPlanController {
  private final LoanPlanService loanPlanService;

  @PostMapping("create")
  public ResponseEntity<LoanPlanRecord> createLoanPlan(@RequestBody LoanPlanRecord loanPlanRecord, @RequestParam Long repaymentCyclesId){
    LoanPlanRecord createLoanPlan=loanPlanService.createLoanPlan(loanPlanRecord,repaymentCyclesId);
    return ResponseEntity.ok(createLoanPlan);
  }
}
