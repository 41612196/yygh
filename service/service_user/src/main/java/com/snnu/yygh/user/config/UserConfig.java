package com.snnu.yygh.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.snnu.yygh.user.mapper")
public class UserConfig {
}
