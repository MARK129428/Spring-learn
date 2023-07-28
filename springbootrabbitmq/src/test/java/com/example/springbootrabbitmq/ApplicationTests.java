package com.example.springbootrabbitmq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    Producer producer;
    @Test
    public void contextLoads() throws InterruptedException {
        producer.produce();
        Thread.sleep(1*1000);
    }

    @Test
    public void testWork() throws InterruptedException {
        producer.produce();
    }
}