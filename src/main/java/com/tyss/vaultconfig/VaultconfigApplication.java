package com.tyss.vaultconfig;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Crendential.class)

public class VaultconfigApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(VaultconfigApplication.class);
    private Crendential crendential;


    public VaultconfigApplication(Crendential crendential) {
        this.crendential = crendential;
    }

    public static void main(String[] args) {
        SpringApplication.run(VaultconfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("--------properties---------");
        logger.info("Username is {}", crendential.getUsername());
        logger.info("Password is {}", crendential.getPassword());
    }
}
