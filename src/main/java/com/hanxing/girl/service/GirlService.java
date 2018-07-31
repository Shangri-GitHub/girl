package com.hanxing.girl.service;

import com.hanxing.girl.domain.Girl;
import com.hanxing.girl.enums.ResultEnums;
import com.hanxing.girl.exception.GirlException;
import com.hanxing.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void GirlAddTwo() {

        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("C");

        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setAge(1);
        girlB.setCupSize("D");

        girlRepository.save(girlB);
    }

    public void compareAge(int age)throws Exception{
        List <Girl> grils = girlRepository.findByAge(age);
        Integer getAge = grils.get(0).getAge();
        if (getAge < 10) {
            throw new GirlException(ResultEnums.PRIMARY_SCHOOL);
        } else if (getAge >= 10 && getAge < 20) {
            throw new GirlException(ResultEnums.MIDDLE_SCHOLLE);
        }
    }

    /**
     * 通过id查询一个女生
     * @param id
     * @return
     */

    public Girl girlfindOne(Integer id) {
        return girlRepository.findById(id).get();
    }

    /**
     * 找到cupsize是B，年龄小于13的女生
     */




}
