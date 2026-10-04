package com.fintech.core.service;

import com.fintech.core.dto.TransferRequestDTO;
import com.fintech.core.dto.TransferResponseDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransferService {

    public TransferResponseDTO transfer(TransferRequestDTO request) {
        // Passa um Long (1L), uma String ("SUCCESS") e um LocalDateTime (LocalDateTime.now())
        return new TransferResponseDTO(
                1L,
                "SUCCESS",
                LocalDateTime.now()
        );
    }
}