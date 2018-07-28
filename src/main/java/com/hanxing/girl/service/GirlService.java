package com.hanxing.girl.service;

import com.hanxing.girl.domain.Girl;
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
            throw new GirlException(100, "你还在上小学");
        } else if (getAge >= 10 && getAge < 20) {
            throw new GirlException(200, "你上中学");
        }
    }

}
