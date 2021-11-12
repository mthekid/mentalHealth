package com.starlab.msa.mentalHealth.service;

import com.starlab.msa.mentalHealth.domain.stress.StressAnswer;

import java.util.List;

public interface StressService {

    StressAnswer getRecentStressAnswer(Long userid);
    List<StressAnswer> getAllStressAnswer(Long userid);
}
