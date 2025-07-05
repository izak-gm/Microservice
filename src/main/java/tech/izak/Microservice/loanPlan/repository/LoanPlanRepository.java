package tech.izak.Microservice.loanPlan.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.izak.Microservice.loanPlan.entity.LoanPlan;

import java.util.Optional;

@Repository
public interface LoanPlanRepository extends JpaRepository<LoanPlan,Long> {
}
