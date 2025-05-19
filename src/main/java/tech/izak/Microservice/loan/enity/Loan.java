package tech.izak.Microservice.loan.enity;

import jakarta.persistence.*;
import lombok.Data;
import tech.izak.Microservice.loan.Enum.STATUS;
import tech.izak.Microservice.loan.Enum.TYPE;
import tech.izak.Microservice.User.entity.User;

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
  @ManyToOne()
  private User user;
  @Column
  private Integer principle_amount;
  @Column
  private Double processing_fee;
  @Column
  private Double outstanding_balance;
  @Enumerated(EnumType.STRING)
  private TYPE type;
  @Enumerated(EnumType.STRING)
  private STATUS status;
}
