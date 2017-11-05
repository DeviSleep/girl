package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by des on 2017/11/5.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    // 通过年龄来查询
    public List<Girl> findByAge(Integer age);

}
