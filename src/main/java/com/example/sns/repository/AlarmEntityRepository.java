package com.example.sns.repository;

import com.example.sns.model.Entity.AlarmEntity;
import com.example.sns.model.Entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmEntityRepository extends JpaRepository<AlarmEntity, Integer> {
    Page<AlarmEntity> findAllByUser(UserEntity user, Pageable pageable);
}
