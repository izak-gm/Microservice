package tech.izak.Microservice.repayment_cycle.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.repayment_cycle.dto.RepaymentCycleRecord;
import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;
import tech.izak.Microservice.repayment_cycle.repository.RepaymentCycleRepository;

@Service
@AllArgsConstructor
public class RepaymentCycleService {
  private final RepaymentCycleRepository repaymentCycleRepository;

  public RepaymentCycleRecord createRepaymentCycle(RepaymentCycleRecord repaymentCycleRecord){
    RepaymentCycle repaymentCycle=new RepaymentCycle();
    repaymentCycle.setName(repaymentCycleRecord.name());
    repaymentCycle.setDurationInDays(repaymentCycleRecord.days());

    RepaymentCycle saveRepaymentCycle=repaymentCycleRepository.save(repaymentCycle);
    return new RepaymentCycleRecord(
          saveRepaymentCycle.getId(),
          saveRepaymentCycle.getDurationInDays(),
          saveRepaymentCycle.getName()
    );
  }
}
