package com.bekprotek.bekprotek.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.bekprotek.bekprotek")
@EnableJpaRepositories("com.bekprotek.bekprotek")
public class HibernateConfig {
}