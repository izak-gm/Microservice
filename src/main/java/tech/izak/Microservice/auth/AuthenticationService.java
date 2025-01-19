package tech.izak.Microservice.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.User.User;
import tech.izak.Microservice.User.UserRepository;
import tech.izak.Microservice.configuration.JwtService;

import javax.management.relation.Role;

@Service

public class AuthenticationService {
//  private final UserRepository userRepository;
//  private final PasswordEncoder passwordEncoder;
//  private final JwtService jwtService;
//
//  public AuthenticationService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
//    this.userRepository = userRepository;
//    this.passwordEncoder = passwordEncoder;
//    this.jwtService = jwtService;
//  }

  public AuthenticationResponse register(RegisterRequest registerRequest) {
    return null;
  }

  public AuthenticationResponse authenticate(AuthenticateRequest authenticateRequest) {
    return null;
  }
}
