package tech.izak.Microservice.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.User.Auth;
import tech.izak.Microservice.User.User;
import tech.izak.Microservice.User.UserRepository;
import tech.izak.Microservice.configuration.JwtService;

import javax.management.relation.Role;

@Service

public class AuthenticationService {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final JwtService jwtService;
  private AuthenticationManager authenticationManager;

  public AuthenticationService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.jwtService = jwtService;
  }

  public AuthenticationResponse register(RegisterRequest registerRequest) {
    var user = User.builder()
          .firstname(registerRequest.getFirstname())
          .lastname(registerRequest.getLastname())
          .email(registerRequest.getEmail())
          .password(passwordEncoder.encode(registerRequest.getPassword()))
          .auth(Auth.User)
          .build();
    userRepository.save(user);
    var jwtToken=jwtService.generateToken(user);
    return AuthenticationResponse.builder()
          .token(jwtToken)
          .build();
  }

  public AuthenticationResponse authenticate(AuthenticateRequest authenticateRequest) {
    authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(
                authenticateRequest.getEmail(),
                authenticateRequest.getPassword()
          )
    );
    var user =userRepository.findByEmail(authenticateRequest.getEmail())
          .orElseThrow();
    var jwtToken =jwtService.generateToken(user);

    return AuthenticationResponse.builder()
          .token(jwtToken)
          .build();
  }
}
