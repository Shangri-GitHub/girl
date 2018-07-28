package com.hanxing.girl.controller;


import com.hanxing.girl.domain.Girl;
import com.hanxing.girl.domain.Result;
import com.hanxing.girl.repository.GirlRepository;
import com.hanxing.girl.service.GirlService;
import com.hanxing.girl.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    // 事务管理
    @GetMapping(value = "girls/two")
    public void GirlAddTwo (){
        girlService.GirlAddTwo();
    }


    // 查询所有的接口
    @GetMapping(value = "/girls")
    public List <Girl> girlList() {
        return girlRepository.findAll();
    }

    // 添加一个女生
    @PostMapping(value = "/girls")
    public Result addGirl(@Valid Girl girl, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return ResultUtils.error(bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
        return ResultUtils.success(girlRepository.save(girl));
    }

    // 通过id查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlfindOne(@PathVariable("id") Integer id) {
        return girlRepository.findById(id).get();
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlfindByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }


    // 通过id查询一个女生

    @PutMapping(value = "/girls/{id}")

    public Girl grilUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    // 更新女生列表

    @DeleteMapping(value = "/girls/{id}")
    // 删除一个女生
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }


}
