package com.grupo08.config_server_grupo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Centraliza la configuración externa de los microservicios ClinicaCloud.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo08Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo08Application.class, args);
    }
}
