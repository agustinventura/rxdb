package com.digitalsingular.rxdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

@Configuration
@EnableR2dbcRepositories
public class DataBaseConfiguration extends AbstractR2dbcConfiguration {
	  
	  @Bean
	  public ConnectionFactory connectionFactory() {
			PostgresqlConnectionConfiguration config =
				PostgresqlConnectionConfiguration.builder()
					.database("sigpac")
					.password("sigpac")
					.username("sigpac")
					.host("localhost")
					.build();
			return new PostgresqlConnectionFactory(config);

		}
}
