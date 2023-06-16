// package com.boardapp.boardapi.board.config;

// import javax.sql.DataSource;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
// import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
// import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
// import org.springframework.jdbc.datasource.DataSourceTransactionManager;
// import org.springframework.transaction.TransactionManager;

// @Configuration
// @EnableJdbcAuditing
// @EnableJdbcRepositories(basePackages = "net.luversof.user.**.repository",
// jdbcOperationsRef = "boardNamedParameterJdbcOperations")
// public class BoardDataJdbcConfig extends AbstractJdbcConfiguration {
// @Bean
// @Primary
// NamedParameterJdbcOperations boardNamedParameterJdbcOperations(
// @Qualifier("boardDataSource") DataSource boardDataSource) {
// return new NamedParameterJdbcTemplate(boardDataSource);
// }

// @Bean
// @Primary
// TransactionManager boardTransactionManager(
// @Qualifier("boardDataSource") DataSource boardDataSource) {
// return new DataSourceTransactionManager(boardDataSource);
// }
// }
