
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TransferHistory;

@Repository
public interface TransferHistoryRepository extends JpaRepository<TransferHistory, Long> {

}
