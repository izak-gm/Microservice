package tech.izak.Microservice.auth;

import lombok.*;

@Builder

public record AuthenticateRequest(String email, String password) {

}
