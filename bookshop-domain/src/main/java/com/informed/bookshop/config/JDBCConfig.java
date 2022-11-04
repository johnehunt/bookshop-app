package com.informed.bookshop.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages = {
  "com.informed.bookshop.dao"})
@EntityScan(basePackages =
  {"com.informed.bookshop.domain",
    "com.informed.bookshop.refdata"})
@EnableJpaRepositories(basePackages =
  {"com.informed.bookshop.repo"})
public class JDBCConfig {
//  @Value("${spring.datasource.url}")
//  private String jdbcUrl;
//  @Value("${spring.datasource.driver-class-name}")
//  private String jdbcDriverClassName;
//  @Value("${spring.datasource.username}")
//  private String jdbcUsername;
//  @Value("${spring.datasource.password}")
//  private String jdbcPassword;
//
//  @Bean("dataSource")
//  public DataSource getDataSource() {
//    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    dataSource.setDriverClassName(jdbcDriverClassName);
//    dataSource.setUrl(jdbcUrl);
//    dataSource.setUsername(jdbcUsername);
//    dataSource.setPassword(jdbcPassword);
//    return dataSource;
//  }
//
//  @Bean("jdbcTemplate")
//  public JdbcTemplate getJdbcTemplate(@Autowired DataSource dataSource) {
//    return new JdbcTemplate(dataSource);
//  }
//
//  @Bean
//  public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {
//    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//    factory.setDataSource(dataSource);
//    factory.setPersistenceUnitName("BookstoreJPA");
//    factory.setJpaDialect(new HibernateJpaDialect());
//    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//    adapter.setShowSql(true);
//    adapter.setGenerateDdl(true);
//    factory.setJpaVendorAdapter(adapter);
//    factory.setPackagesToScan("com.informed.bookshop.domain");
//    return factory;
//  }
//
}
