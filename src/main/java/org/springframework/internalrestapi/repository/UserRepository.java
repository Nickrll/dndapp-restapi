package org.springframework.internalrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.internalrestapi.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
