package tech.izak.Microservice.Authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtService {
  private static final String SECRET_KEY="MFqtafUPOSjDhDCKM6gubnIyf1+BNwEBQpCMMfFGfR9URDLIgJIOCPCjC3WiYzGO";
  public String extractUsername(String token) {
    return null;
  }

  private Claims extractAllClaims(String token) {
    return Jwts.parser()
          .verifyWith(getSignInKey())
          .build()
          .parseSignedClaims(token)
          .getPayload();
  }

  private SecretKey getSignInKey() {
    byte[] keysBytes= Decoders.BASE64.decode(SECRET_KEY);
    return Keys.hmacShaKeyFor(keysBytes);
  }

}
