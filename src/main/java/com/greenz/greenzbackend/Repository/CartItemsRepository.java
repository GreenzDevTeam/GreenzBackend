package com.greenz.greenzbackend.Repository;

import com.greenz.greenzbackend.Entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, UUID> {
}
