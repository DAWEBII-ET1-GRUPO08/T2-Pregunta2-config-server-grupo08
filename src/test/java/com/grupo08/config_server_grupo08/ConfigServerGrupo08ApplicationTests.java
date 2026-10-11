package com.grupo08.config_server_grupo08;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.cloud.config.server.git.uri=file:./src/test/resources/config-repository",
        "spring.cloud.config.server.git.clone-on-start=false"
})
class ConfigServerGrupo08ApplicationTests {

    @Test
    void contextLoads() {
    }
}
