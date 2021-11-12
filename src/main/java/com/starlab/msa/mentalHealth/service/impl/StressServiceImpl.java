package com.starlab.msa.mentalHealth.service.impl;

import com.starlab.msa.mentalHealth.domain.stress.StressAnswer;
import com.starlab.msa.mentalHealth.repository.StressAnswerRepository;
import com.starlab.msa.mentalHealth.service.StressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StressServiceImpl implements StressService {

    private final StressAnswerRepository stressAnswerRepository;

    @Autowired
    public StressServiceImpl(StressAnswerRepository stressAnswerRepository) {
        this.stressAnswerRepository = stressAnswerRepository;
    }

    @Override
    public StressAnswer getRecentStressAnswer(Long userid) {
        List<StressAnswer> stressAnswerList = stressAnswerRepository.findAllByUserId(userid);

        stressAnswerList.sort( (s1, s2) -> {
            return s2.getCreateDate().compareTo(s1.getCreateDate());
        });

        return stressAnswerList.get(0);
    }

    @Override
    public List<StressAnswer> getAllStressAnswer(Long userid) {
        return stressAnswerRepository.findAllByUserId(userid);
    }
}
