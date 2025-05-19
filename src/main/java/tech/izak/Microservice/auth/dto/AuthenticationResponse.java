package tech.izak.Microservice.auth.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class AuthenticationResponse {
  private String token;
}
