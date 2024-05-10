package robidev.belajarspringlogging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import lombok.extern.slf4j.Slf4j; // Added import statement

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:/application-test.properties")
public class LoggingTest {
    @Test
    void testLongLogging() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Hello World {}", i);
        }
    }

    @Test
    void testLogging() {
        log.info("ini info");
        log.warn("ini warning");
        log.error("ini error");
    }
}
