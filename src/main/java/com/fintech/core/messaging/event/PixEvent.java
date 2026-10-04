package com.fintech.core.messaging.event;

import java.math.BigDecimal;

public record PixEvent(
        Long ledgerId,
        BigDecimal amount
) {}