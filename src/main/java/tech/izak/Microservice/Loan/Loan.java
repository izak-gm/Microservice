package tech.izak.Microservice.Loan;

import jakarta.persistence.*;
import tech.izak.Microservice.Employee.Entities.Employee;

@Entity
@Table(name = "Loan")
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
//    private Employee userid;

  private Integer principleAmount;
  private Double processingFee;
  private Double outstandingBalance;
  private Integer loanTypeId;
  private String loanStatus;

  public Integer getPrincipleAmount() {
    return principleAmount;
  }

  public void setPrincipleAmount(Integer principleAmount) {
    this.principleAmount = principleAmount;
  }

  public Double getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(Double processingFee) {
    this.processingFee = processingFee;
  }

  public Double getOutstandingBalance() {
    return outstandingBalance;
  }

  public void setOutstandingBalance(Double outstandingBalance) {
    this.outstandingBalance = outstandingBalance;
  }

  public Integer getLoanTypeId() {
    return loanTypeId;
  }

  public void setLoanTypeId(Integer loanTypeId) {
    this.loanTypeId = loanTypeId;
  }

  public String getLoanStatus() {
    return loanStatus;
  }

  public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
  }
}
