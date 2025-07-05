package tech.izak.Microservice.loan.enity;

import jakarta.persistence.*;
import lombok.Data;
import tech.izak.Microservice.loan.Enum.STATUS;
import tech.izak.Microservice.loan.Enum.TYPE;
import tech.izak.Microservice.User.entity.User;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;

import java.util.Date;

@Entity
@Data
@Table(name = "loan")
public class Loan {
  @Id
  @SequenceGenerator(
        name = "loan_sequence",
        sequenceName = "loan_sequence",
        allocationSize = 1
  )
  @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "loan_sequence"
  )

  private Integer id;
  private Integer principleAmount;
  private Double outstandingAmount;
  private Double initialAmount;
  private Double repaymentCycleAmount;
  private Double fineRepaid;
  private String loanCode;
  private Date applicationDate;
  private Date disbursementDate;
  private Double principleRepaid;

  @ManyToOne()
  private LoanPlan loanPlans;
  @ManyToOne()
  private User Admin;
  @ManyToOne()
  private User creditOfficer;
  @ManyToOne()
  private User client;
  @Enumerated(EnumType.STRING)
  private TYPE type;
  @Enumerated(EnumType.STRING)
  private STATUS status;
}
