package tech.izak.Microservice.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.izak.Microservice.loan.enity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Integer> {
}
