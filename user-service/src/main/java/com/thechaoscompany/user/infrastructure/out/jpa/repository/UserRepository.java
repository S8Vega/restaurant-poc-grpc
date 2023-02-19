package com.thechaoscompany.user.infrastructure.out.jpa.repository;

import com.thechaoscompany.user.infrastructure.out.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
