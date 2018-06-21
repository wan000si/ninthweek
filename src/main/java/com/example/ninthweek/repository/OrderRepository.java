package com.example.ninthweek.repository;

import com.example.ninthweek.entity.Order;
import com.example.ninthweek.entity.OrderForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
   OrderForm findFirstById(Long id);

    //Order findById(Long id);

    List<Order> findByUserId(Long userId);

    @Transactional
    @Modifying
    @Query("update Order o set o.orderStatus='paid',o.payTime=?2 where o.id=?1")
    int updateStatusByPaid(Long id, String payTime);

    @Transactional
    @Modifying
    @Query("update Order o set o.orderStatus='withdrawn',o.withdrawTime=?2 where o.id=?1")
    int updateStatusByWithdraw(Long id, String withdraw);
}
