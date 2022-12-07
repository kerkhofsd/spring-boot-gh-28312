package com.github.kerkhofsd.springbootgh28312;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootGh28312ApplicationTest {

    private static final Logger log = LoggerFactory.getLogger(SpringBootGh28312ApplicationTest.class);

    @Autowired
    private CustomSmartLifeCycle customSmartLifeCycle;

    @Test
    void contextLoads() {
        log.info("contextLoads(). CustomSmartLifeCycle: [{}]", customSmartLifeCycle);
        assertThat(customSmartLifeCycle).isNotNull();
    }

}
