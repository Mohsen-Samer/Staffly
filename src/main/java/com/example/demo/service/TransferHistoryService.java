
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TransferHistory;
import com.example.demo.repository.TransferHistoryRepository;

@Service
public class TransferHistoryService {

    private final TransferHistoryRepository transferHistoryRepository;

    public TransferHistoryService(TransferHistoryRepository transferHistoryRepository) {
        this.transferHistoryRepository = transferHistoryRepository;
    }

    public TransferHistory createTransfer(TransferHistory transferHistory) {
        return transferHistoryRepository.save(transferHistory);
    }

    public List<TransferHistory> getAllTransfers() {
        return transferHistoryRepository.findAll();
    }

    public TransferHistory getTransferById(Long id) {
        return transferHistoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transfer not found"));
    }

    public void deleteTransfer(Long id) {
        TransferHistory transfer = getTransferById(id);
        transferHistoryRepository.delete(transfer);
    }
}
