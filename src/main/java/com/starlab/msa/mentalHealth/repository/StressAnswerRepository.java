package com.starlab.msa.mentalHealth.repository;

import com.starlab.msa.mentalHealth.domain.stress.StressAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StressAnswerRepository extends JpaRepository<StressAnswer, Long> {

    List<StressAnswer> findAllByUserId(Long userid);
}
