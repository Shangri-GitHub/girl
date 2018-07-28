package com.hanxing.girl.service;

import com.hanxing.girl.domain.Girl;
import com.hanxing.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void GirlAddTwo (){

        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("C");

        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setAge(1);
        girlB.setCupSize("D");

        girlRepository.save(girlB);
    }

}
