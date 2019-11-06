package org.springframework.internalrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.internalrestapi.models.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
