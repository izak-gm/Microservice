package tech.izak.Microservice.Loan;

import jakarta.persistence.*;
import lombok.Data;
import tech.izak.Microservice.Loan.Enum.STATUS;
import tech.izak.Microservice.Loan.Enum.TYPE;
import tech.izak.Microservice.User.User;

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
        generator = "Loan_sequence"
  )

    private Integer id;
//    @OneToOne
//    @JoinColumn(name = "loan" ,referencedColumnName = "loan")
    private User userid;
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
