package com.hanxing.girl;

import com.hanxing.girl.controller.GirlController;
import com.hanxing.girl.domain.Girl;
import com.hanxing.girl.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GrilserviceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() {

        Girl girl = girlService.girlfindOne(9);
        Assert.assertEquals(18,girl.getAge());

    }
}
