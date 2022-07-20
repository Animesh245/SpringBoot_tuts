//package com.animesh245.bsuserinfo.config;
//
//import io.r2dbc.spi.ConnectionFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
//import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
//
//@Configuration
//@EnableR2dbcRepositories(basePackages = {"com.animesh245.bsuserinfo.config"})
//public class DbConfig extends AbstractR2dbcConfiguration {
//
//    @Value(value = "${datasource.host}")
//    private String host;
//
//    @Value(value = "${datasource.port}")
//    private int port;
//
//    @Value(value = "${datasource.database}")
//    private String database;
//
//    @Value(value = "${datasource.username}")
//    private String username;
//
//    @Value(value = "${datasource.password}")
//    private String password;
//
//    @Bean
//    @Override
//    public ConnectionFactory connectionFactory() {
//        return new PostgresqlConnectionFactory(PostgresqlConfiguration
//                .builder()
//        )
//
//    }
//}
