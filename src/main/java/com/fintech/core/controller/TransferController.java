package com.fintech.core.controller;

import com.fintech.core.dto.TransferRequestDTO;
import com.fintech.core.dto.TransferResponseDTO;
import com.fintech.core.service.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping
    public ResponseEntity<TransferResponseDTO> transfer(@RequestBody TransferRequestDTO request) {
        TransferResponseDTO response = transferService.transfer(request);
        return ResponseEntity.ok(response);
    }
}