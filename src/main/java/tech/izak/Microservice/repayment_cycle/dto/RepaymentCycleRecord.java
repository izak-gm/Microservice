package tech.izak.Microservice.repayment_cycle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record RepaymentCycleRecord(  Long id,
                                     @NotNull(message = "Days are required ")
                                     Integer days,
                                     @NotNull(message = "Name are required ")
                                     String name
) {
}
