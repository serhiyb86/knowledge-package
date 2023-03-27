package com.task.knowledge.configuration;

import javax.sql.DataSource;


import com.task.knowledge.DAO.KPacDAO;

import com.task.knowledge.DAO.KPacDAOImpl;
import com.task.knowledge.DAO.KPacSetDAO;
import com.task.knowledge.DAO.KPacSetDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages="com.task.knowledge")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/script/**").addResourceLocations("/script/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    }

    @Bean
    public DataSource getDataSource() {
        //todo connection pool
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/kpac_db");
        dataSource.setUsername("kpac");
        dataSource.setPassword("3N~2b-eNj6");
        return dataSource;
    }

    @Bean
    public KPacDAO getKpacDAO() {
        return new KPacDAOImpl(getDataSource());
    }

    @Bean
    public KPacSetDAO getKpacSetDAO() {
        return new KPacSetDAOImpl(getDataSource());
    }
}
