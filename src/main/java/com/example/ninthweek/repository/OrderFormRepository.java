package com.example.ninthweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFormRepository extends JpaRepository<OrderFormRepository,Long> {
}
