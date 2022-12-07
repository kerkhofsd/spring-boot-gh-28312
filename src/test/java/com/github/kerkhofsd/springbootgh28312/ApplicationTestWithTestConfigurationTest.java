package com.github.kerkhofsd.springbootgh28312;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@Import(ApplicationTestWithTestConfigurationTest.TestConfig.class)
@SpringBootTest
class ApplicationTestWithTestConfigurationTest {

    private static final Logger log = LoggerFactory.getLogger(SpringBootGh28312ApplicationTest.class);

    @TestConfiguration
    public static class TestConfig {

        @Bean
        public String dummyBean() {
            return "dummy";
        }

    }


    @Autowired
    private CustomSmartLifeCycle customSmartLifeCycle;

    @Test
    void contextLoads() {
        log.info("contextLoads(). CustomSmartLifeCycle: [{}]", customSmartLifeCycle);
        assertThat(customSmartLifeCycle).isNotNull();
    }
}
