package com.odin.gdpr.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.odin.gdpr")
public class FeignConfiguration {

}
