package tech.izak.Microservice.auth;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class AuthenticationResponse {
  private String token;
}
