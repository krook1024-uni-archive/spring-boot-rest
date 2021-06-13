package com.krook1024.rest.dataaccess.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.krook1024.rest.dataaccess.dao")
@EntityScan("com.krook1024.rest.dataaccess.projection")
public class JpaConfiguration {

}
