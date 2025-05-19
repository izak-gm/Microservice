package tech.izak.Microservice.capital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tech.izak.Microservice.User.entity.User;

@Entity
@Setter
@Getter
@Table(name="capital")
public class Capital {
  @Id
  @SequenceGenerator(
        name = "capital_sequence",
        sequenceName = "capital_sequence",
        allocationSize = 1
  )
  @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "capital_sequence"
  )

  private Long Id;
  @Column()
  private Integer amount;
  private String narration;
  private Integer balance;
  @ManyToOne()
  private User user;
}
