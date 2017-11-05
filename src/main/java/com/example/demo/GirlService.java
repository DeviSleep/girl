package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by des on 2017/11/5.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    // 事务 注解
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("C");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("A30");
        girlB.setAge(17);
        girlRepository.save(girlB);

    }

}
