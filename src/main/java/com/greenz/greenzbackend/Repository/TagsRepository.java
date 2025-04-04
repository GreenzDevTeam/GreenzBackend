package com.greenz.greenzbackend.Repository;

import com.greenz.greenzbackend.Entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface TagsRepository extends JpaRepository<Tags, UUID> {
}
