package com.learnspring.spring.csr.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String hello(){
        return "Hello repository";
    }
}
