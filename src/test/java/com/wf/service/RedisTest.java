package com.wf.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test(){
//        redisTemplate.opsForValue().set("str", "feifei");
        redisTemplate.boundValueOps("str").set("feifei");
        System.out.println("str =" + redisTemplate.opsForValue().get("str"));
    }
}
