package com.boardapp.boardapi.common.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @PropertySource(value = "classpath:jdbc-board.yaml", ignoreResourceNotFound = true)
// @PropertySource(value = "classpath:jdbc-board-${spring.profiles.active}.yaml",
// ignoreResourceNotFound = true)
// @PropertySource(value = "classpath:jdbc-user.yaml", ignoreResourceNotFound = true)
// @PropertySource(value = "classpath:jdbc-user-${spring.profiles.active}.yaml",
// ignoreResourceNotFound = true)
public class JdbcConfig {
    // @Bean
    // @ConfigurationProperties("datasource.board")
    // DataSourceProperties boardDataSourceProperties() {
    // return new DataSourceProperties();
    // }

    // @Bean
    // @ConfigurationProperties("datasource.user")
    // DataSourceProperties userDataSourceProperties() {
    // return new DataSourceProperties();
    // }

    // @Bean
    // DataSource boardDataSource() {
    // return boardDataSourceProperties().initializeDataSourceBuilder().build();
    // }

    // @Bean
    // DataSource userDataSource() {
    // return userDataSourceProperties().initializeDataSourceBuilder().build();
    // }

}
