package com.example.ninthweek.repository;

import com.example.ninthweek.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    @Transactional
    @Modifying
    @Query("update Inventory i set i.count=?2 where i.id=?1")
    int updateCount(int id, int count);

    @Transactional
    @Modifying
    @Query("update Inventory i set i.lockedCount=?2 where i.id=?1")
    int updateLockedCount(int id, int lockedCount);
}
