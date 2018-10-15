package com.mjm.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    /**
     *  8个日志级别
     *  OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE > ALL
     */
    @Test
    public void LogTest() {
        log.debug("DemoApplicationTests.contextLoads {}", "debug");
        log.trace("=====trace=====");
        log.debug("=====debug=====");
        log.info("=====info=====");
        log.warn("=====warn=====");
        log.error("=====error=====");
    }

}
