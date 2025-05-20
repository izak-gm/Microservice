package tech.izak.Microservice.repayment_cycle.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.izak.Microservice.repayment_cycle.dto.RepaymentCycleRecord;
import tech.izak.Microservice.repayment_cycle.service.RepaymentCycleService;

@Controller
@AllArgsConstructor
@RequestMapping("api/v1/repayment-cycle")
public class RepaymentCycleController {
  private final RepaymentCycleService repaymentCycleService;

  @PostMapping("create")
  public ResponseEntity<RepaymentCycleRecord> createRepaymentCycle(@RequestBody RepaymentCycleRecord repaymentCycleRecord){
    RepaymentCycleRecord createdCycle = repaymentCycleService.createRepaymentCycle(repaymentCycleRecord);
    return ResponseEntity.ok(createdCycle);
  }
}
