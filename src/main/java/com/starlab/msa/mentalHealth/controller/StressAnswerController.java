package com.starlab.msa.mentalHealth.controller;

import com.starlab.msa.mentalHealth.domain.stress.StressAnswer;
import com.starlab.msa.mentalHealth.service.StressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"사용자의 스트레스 검사와 관련된 정보를 제공하는 Controller API입니다."})
@RestController
@RequestMapping("/survey/stress-info")
public class StressAnswerController {

    private StressService stressService;

    @Autowired
    public StressAnswerController(StressService stressService) { this.stressService = stressService ;}

    @ApiOperation(value = "특정 사용자의 최근 스트레스 설문조사 기록 정보를 반환합니다.")
    @GetMapping("/recent-test/{user-id}")
    public StressAnswer getStressInfo(
            @ApiParam(value ="사용자 식별자", type = "Long", example = "1", required = true)
            @PathVariable("user-id") Long id
    ) {
        return stressService.getRecentStressAnswer(id);
    }

    @ApiOperation(value = "특정 사용자의 모든 스트레스 설문조사 기록 정보들을 반환합니다.")
    @GetMapping("/alltest/{user-id}")
    public List<StressAnswer> getAllStressInfo(
            @ApiParam(value = "사용자 식별자", type = "Long", example = "1", required = true)
            @PathVariable("user-id") Long id
    ) {
        return stressService.getAllStressAnswer(id);
    }

}
