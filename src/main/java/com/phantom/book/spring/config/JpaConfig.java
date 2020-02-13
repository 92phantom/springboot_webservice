package com.phantom.book.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // AUTO AUDIT-TIME ADDING, CREATED TIME + MODIFIED TIME
public class JpaConfig {
}
