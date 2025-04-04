package com.greenz.greenzbackend.Repository;


import com.greenz.greenzbackend.Entity.DiscountInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DiscountInventoryRepository extends JpaRepository<DiscountInventory, UUID> {
}
