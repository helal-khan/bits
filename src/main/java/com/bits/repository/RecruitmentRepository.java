package com.bits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.model.Recruitment;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

}
