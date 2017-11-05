package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by des on 2017/11/5.
 */
@RestController
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
//
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    public String say(){
//        return cupSize + age;
//    }
//
//    @RequestMapping(value = "/cupp",method = RequestMethod.GET)
//    public String cup(){
//        return content;
//    }

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }

}
