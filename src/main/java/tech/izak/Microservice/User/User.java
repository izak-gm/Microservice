package tech.izak.Microservice.User;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import tech.izak.Microservice.Loan.Loan;
import tech.izak.Microservice.User.Enum.Auth;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "_user")
public class User implements UserDetails {

  @Id
  @SequenceGenerator(
        name =  "user_sequence",
        sequenceName = "user_sequence",
        allocationSize = 1
  )
  @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
  )
  private int id;
  private String firstname;
  private String lastname;
  private String password;
  private String phoneNumber;
  private String gender;
  private String dob;
  private String email;
  @Enumerated(EnumType.STRING)
  private Auth auth;
  @OneToMany(mappedBy = "user")
  private Set<Loan> loans;
  private  boolean isEnabled=true;
  private  boolean isAccountNonLocked=true;
  private  boolean isCredentialsNonExpired=true;
  private  boolean isAccountNonExpired=true;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority(auth.name()));
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return UserDetails.super.isAccountNonExpired();
  }

  @Override
  public boolean isAccountNonLocked() {
    return UserDetails.super.isAccountNonLocked();
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return UserDetails.super.isCredentialsNonExpired();
  }

  @Override
  public boolean isEnabled() {
    return UserDetails.super.isEnabled();
  }
}
