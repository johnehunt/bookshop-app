package com.informed.bookshop.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@DataJpaTest
//@Configuration -- can't use with @DataJpaTest
@ComponentScan(basePackages = {
  "com.informed.bookshop.service",
  "com.informed.bookshop.dao"})
@EntityScan(basePackages =
  {"com.informed.bookshop.domain"})
@EnableJpaRepositories(basePackages =
  {"com.informed.bookshop.repo"})
public class ServiceTestConfig {
}
