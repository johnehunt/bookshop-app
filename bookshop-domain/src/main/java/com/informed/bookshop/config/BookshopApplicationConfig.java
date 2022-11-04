package com.informed.bookshop.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages =
  {"com.informed.bookshop.service",
   "com.informed.bookshop.controller"})
public class BookshopApplicationConfig { }
