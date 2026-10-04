package com.fintech.core.dto;

import java.time.LocalDateTime;

public record TransferResponseDTO(
        Long transactionId,
        String status,
        LocalDateTime timestamp
) {}