package tech.izak.Microservice.auth.dto;

import lombok.*;

@Builder

public record AuthenticateRequest(String email, String password) {

}
