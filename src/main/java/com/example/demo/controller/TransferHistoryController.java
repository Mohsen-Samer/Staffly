
package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TransferHistory;
import com.example.demo.service.TransferHistoryService;
@CrossOrigin(origins = {
    "http://localhost:5500",
    "http://127.0.0.1:5500"
})
@RestController
@RequestMapping("/api/transfers")
public class TransferHistoryController {

    private final TransferHistoryService transferHistoryService;

    public TransferHistoryController(TransferHistoryService transferHistoryService) {
        this.transferHistoryService = transferHistoryService;
    }

    @PostMapping
    public TransferHistory createTransfer(@RequestBody TransferHistory transferHistory) {
        return transferHistoryService.createTransfer(transferHistory);
    }

    @GetMapping
    public List<TransferHistory> getAllTransfers() {
        return transferHistoryService.getAllTransfers();
    }

    @GetMapping("/{id}")
    public TransferHistory getTransferById(@PathVariable Long id) {
        return transferHistoryService.getTransferById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransfer(@PathVariable Long id) {
        transferHistoryService.deleteTransfer(id);
        return ResponseEntity.noContent().build();
    }
}
