package tech.izak.Microservice.configuration;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Service
public class JwtService {
  private final String SECRET_KEY="MFqtafUPOSjDhDCKM6gubnIyf1+BNwEBQpCMMfFGfR9URDLIgJIOCPCjC3WiYzGO";
  public String extractUsername(String token) {
    return extractClaim(token ,Claims::getSubject);
  }

  public <T> T extractClaim(String token, Function<Claims,T> claimsResolver ){
    final Claims claims=extractAllClaims(token);
    return  claimsResolver.apply(claims);
  }

//  extract using the userDetails
  public String generateToken(UserDetails userDetails){
    return generateToken(new HashMap<>(),userDetails);
  }

  public String generateToken(
        Map<String ,Object> extraClaims, UserDetails userDetails
  ){
    return Jwts.builder()
          .claims(extraClaims)
          .subject(userDetails.getUsername())
          .issuedAt(new Date(System.currentTimeMillis()))
          .expiration(new Date(System.currentTimeMillis() +1000 *60 *24))
          .signWith(getSignInKey())
          .compact();
  }


  public boolean  isTokenValid(String token ,UserDetails userDetails){
    final  String username=extractUsername(token);
    return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
  }

  private boolean isTokenExpired(String token) {
    return  extractExpiration(token).before(new Date());
  }

  private Date extractExpiration(String token) {
    return  extractClaim(token ,Claims::getExpiration);
  }

  private SecretKey getSignInKey() {
    return Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
  }

  public Claims extractAllClaims(String accessToken) {
    return Jwts.parser()
          .verifyWith(getSignInKey()) // Ensure this is a valid Key
          .build()
          .parseSignedClaims(accessToken)
          .getPayload();
  }
//  private SecretKey getSignInKey() {
//    byte[] keysBytes= Decoders.BASE64.decode(SECRET_KEY);
//    return Keys.hmacShaKeyFor(keysBytes);
//  }
}
