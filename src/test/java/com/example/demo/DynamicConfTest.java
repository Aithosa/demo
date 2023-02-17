package com.example.demo;

import com.example.demo.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DynamicConfTest extends DemoApplicationTests {
    @Test
    public void test() {
        log.info("app.id={}", Config.getAppId());
        log.info("conf.enable={}", Config.getConfEnable());
        log.info("connect.num={}", Config.getConnectNum());
    }
}
