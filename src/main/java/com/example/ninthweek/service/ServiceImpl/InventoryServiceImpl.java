package com.example.ninthweek.service.ServiceImpl;

import com.example.ninthweek.repository.InventoryRepository;
import com.example.ninthweek.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;


    @Override
    public int updateCount(int id, int count) {
        return inventoryRepository.updateCount(id,count);
    }

    @Override
    public int updateLockedCount(int id, int lockedCount) {
        return inventoryRepository.updateLockedCount(id ,lockedCount);
    }
}
