package tech.izak.Microservice.auth.service;

import org.apache.logging.log4j.LogManager;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.izak.Microservice.User.Enum.Auth;
import tech.izak.Microservice.User.entity.User;
import tech.izak.Microservice.User.repository.UserRepository;
import tech.izak.Microservice.auth.dto.AuthenticateRequest;
import tech.izak.Microservice.auth.dto.AuthenticationResponse;
import tech.izak.Microservice.auth.dto.RegisterRequest;
import tech.izak.Microservice.configuration.JwtService;

@Service

public class AuthenticationService {
  private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(AuthenticationService.class);
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final JwtService jwtService;
  private final AuthenticationManager authenticationManager;

  public AuthenticationService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService, AuthenticationManager authenticationManager) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.jwtService = jwtService;
    this.authenticationManager = authenticationManager;
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
    log.info("user created");
    var jwtToken=jwtService.generateToken(user);
    return AuthenticationResponse.builder()
          .token(jwtToken)
          .build();
  }

  public AuthenticationResponse authenticate(AuthenticateRequest authenticateRequest) {
    authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(
                authenticateRequest.email(),
                authenticateRequest.password()
          )
    );
    var user =userRepository.findByEmail(authenticateRequest.email())
          .orElseThrow(()->{
            System.err.println("User not found: " + authenticateRequest.email());
            return new RuntimeException("User not found.");
          });
    System.out.println("User retrieved: " + user);
    var jwtToken=jwtService.generateToken(user);
    return AuthenticationResponse.builder()
          .token(jwtToken)
          .build();
  }
}
