package tech.izak.Microservice.repayment_cycle.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.izak.Microservice.repayment_cycle.entity.RepaymentCycle;

import java.util.Optional;

@Repository
public interface RepaymentCycleRepository extends JpaRepository<RepaymentCycle ,Long> {

//  Optional<RepaymentCycle> findById( Long id);
}
