package com.starlab.msa.mentalHealth.controller;

import com.starlab.msa.mentalHealth.domain.StressInfo;
import com.starlab.msa.mentalHealth.service.StressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"사용자의 스트레스 검사와 관련된 정보를 제공하는 Controller API입니다."})
@RestController
@RequestMapping("/survey/stress-info")
public class StressSurveyController {

    private StressService stressService;

    @Autowired
    public StressSurveyController(StressService stressService) { this.stressService = stressService ;}

    @ApiOperation(value = "특정 사용자의 최근 스트레스 정보 기록")
    @GetMapping("/recent-test{user-id}")
    public StressInfo getStressInfo() {
        return null;
    }

    @ApiOperation(value = "특정 사용자의 모든 스트레스 정보 기록")
    @GetMapping("/alltest{user-id}")
    public List<StressInfo> getAllStressInfo() {
        return null;
    }


}
