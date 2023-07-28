package com.hhk.springredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class TestRedisTemplate {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString() {
        // 调用set()方法创建缓存
        redisTemplate.opsForValue().set("hello:redis", "hello spring boot");
        System.out.println("hello redis: "+ redisTemplate.opsForValue().get("hello:redis"));
    }

    @Test
    public void testObj(){
        User user=new User();
        user.setName("weiz");
        user.setPassword("123456");
        user.setAge(30);
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        // 调用set()方法创建缓存
        operations.set("user:weiz", user);
        // 调用get()方法获取数据
        User u=operations.get("user:weiz");
        System.out.println("name: "+u.getName()+",u.age:"+u.getAge());
    }
}