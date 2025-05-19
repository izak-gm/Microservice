package tech.izak.Microservice.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.izak.Microservice.auth.dto.AuthenticateRequest;
import tech.izak.Microservice.auth.dto.AuthenticationResponse;
import tech.izak.Microservice.auth.dto.RegisterRequest;
import tech.izak.Microservice.auth.service.AuthenticationService;

@RestController
@RequestMapping("/api/v1/auth/")
public class AuthenticationController {

  private final AuthenticationService authenticationService;

  public AuthenticationController(AuthenticationService authenticationService) {
    this.authenticationService = authenticationService;
  }

  @PostMapping("register")
  public ResponseEntity<AuthenticationResponse> register(
        @RequestBody RegisterRequest registerRequest
  ){
    return ResponseEntity.ok(authenticationService.register(registerRequest));
  }

  @PostMapping("login")
  public ResponseEntity<AuthenticationResponse> authenticate(
        @RequestBody AuthenticateRequest authenticateRequest
  ){
    return ResponseEntity.ok(authenticationService.authenticate(authenticateRequest));
  }
}
