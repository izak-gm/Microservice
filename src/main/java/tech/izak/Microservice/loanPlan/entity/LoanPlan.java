package tech.izak.Microservice.loanPlan.entity;

import jakarta.persistence.*;
import lombok.*;
import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "loanPlan")

public class LoanPlan {
  @Id
@SequenceGenerator(
      name = "loanPlan_sequence",
      sequenceName = "loanPlan_sequence",

      allocationSize = 1
)
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "loanPlan_sequence"
  )
  private Long id;
  private String name;
  private  Integer durationInDays;
  private Integer processingFee;
  private Double interestRate;
  private Double fine;
  @ManyToOne()
  private RepaymentCycle repaymentCycles;
}
