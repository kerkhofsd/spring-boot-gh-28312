package com.github.kerkhofsd.springbootgh28312;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class CustomSmartLifeCycle implements SmartLifecycle {

    private static final Logger log = LoggerFactory.getLogger(CustomSmartLifeCycle.class);

    private static volatile boolean isRunningStatic;
    private volatile boolean isRunning;

    public CustomSmartLifeCycle() {
        log.info("[{}] ctor()", this);
    }

    @Override
    public void start() {
        if (isRunningStatic) {
            throw new IllegalStateException("An instance is still running!");
        }
        isRunning = true;
        isRunningStatic = true;
        log.info("[{}] start()", this);
    }

    @Override
    public void stop() {
        isRunning = false;
        isRunningStatic = false;
        log.info("[{}] stop()", this);
    }

    @Override
    public boolean isRunning() {
        log.info("[{}] isRunning()", this);
        return isRunning;
    }
}
