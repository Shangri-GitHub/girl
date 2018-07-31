package com.hanxing.girl.repository;

import com.hanxing.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GirlRepository extends JpaRepository <Girl, Integer> {
    //通过年龄来查询
    public List <Girl> findByAge(Integer age);

    public  List <Girl>  findByCupSizeAndAgeLessThan(String size,Integer age);

    @Query(value = "select o from Girl o where o.age=?1")
    public  List <Girl>  queryGirlByage(Integer age);

    @Query(value = "select o from Girl o where o.age=:age")
    public  List <Girl>  queryGirlByage1(@Param(value = "age") Integer age);


    // 模糊查询
    @Query(value = "select o from Girl o where o.cupSize like CONCAT('%',:cupSize ,'%')")
    public  List <Girl>  queryGirlByage2(@Param(value = "cupSize") String cupSize);

}
