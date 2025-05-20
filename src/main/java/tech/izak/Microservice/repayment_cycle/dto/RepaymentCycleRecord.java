package tech.izak.Microservice.repayment_cycle.dto;

import lombok.Builder;

@Builder
public record RepaymentCycleRecord(Long id,
                                   Integer durationInDays,
                                   String name) {
}
