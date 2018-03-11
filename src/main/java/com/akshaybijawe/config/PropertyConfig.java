package com.akshaybijawe.config;

import com.akshaybijawe.examplebeans.FakeDataSource;
import com.akshaybijawe.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author arbijawe on 3/10/18
 * @project dependency-injection-demo
 */
@Configuration
public class PropertyConfig {


    @Value("${test.username}")
    String user;

    @Value("${test.password}")
    String password;

    @Value("${test.url}")
    String url;

    @Value("${test.jms.username}")
    String jmsUsername;

    @Value("${test.jms.password}")
    String jmsPassword;

    @Value("${test.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }



}
