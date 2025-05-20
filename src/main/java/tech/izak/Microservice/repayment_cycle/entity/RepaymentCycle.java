package tech.izak.Microservice.repayment_cycle.entity;

import jakarta.persistence.*;
import lombok.*;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "repaymentCycle")
public class RepaymentCycle {
  @Id
  @SequenceGenerator(
        name = "repaymentCycle_sequence",
        sequenceName = "repaymentCycle_sequence",
        allocationSize = 1
  )
  @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "repayment_sequence"
  )
  private Long id;
  private Integer durationInDays;
  private String name;
  @OneToMany(mappedBy = "repaymentCycles")
  private Set<LoanPlan> loanPlans;
}