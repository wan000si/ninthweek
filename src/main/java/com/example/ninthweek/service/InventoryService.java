package com.example.ninthweek.service;

import com.example.ninthweek.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryService {
    int updateCount(Long id, int count);

    int updateLockedCount(Long id, int lockedCount);
}
