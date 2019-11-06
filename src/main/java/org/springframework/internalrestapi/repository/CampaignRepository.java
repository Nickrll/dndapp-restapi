package org.springframework.internalrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.internalrestapi.models.Campaign;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
