package com.hanxing.girl;

import com.hanxing.girl.domain.Girl;
import com.hanxing.girl.repository.GirlRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlApplicationTests {

	@Autowired
	private GirlRepository girlRepository;

	@Test
	public void findByAgeTest() {
		List<Girl> grils = girlRepository.findByAge(18);
		for (Girl gril : grils) {
			System.out.println(gril.getAge());
		}
	}

	@Test
	public void findByCupSizeAndAgeLessThan() {
		List<Girl> grils = girlRepository.findByCupSizeAndAgeLessThan("B",19);
		for (Girl gril : grils) {
			System.out.println(gril.getId()+"getAge:"+gril.getAge()+"getCupSize:"+gril.getCupSize());
		}
	}

	@Test
	public void getGirlByage() {
		List<Girl> grils = girlRepository.queryGirlByage(19);
		for (Girl gril : grils) {
			System.out.println(gril.getId()+"getAge:"+gril.getAge()+"getCupSize:"+gril.getCupSize());
		}
	}

	@Test
	public void queryGirlByage1() {
		List<Girl> grils = girlRepository.queryGirlByage1(19);
		for (Girl gril : grils) {
			System.out.println(gril.getId()+"getAge:"+gril.getAge()+"getCupSize:"+gril.getCupSize());
		}
	}


	@Test
	public void queryGirlByage2() {
		List<Girl> grils = girlRepository.queryGirlByage2("B");
		for (Girl gril : grils) {
			System.out.println(gril.getId()+"getAge:"+gril.getAge()+"getCupSize:"+gril.getCupSize());
		}
	}



}
