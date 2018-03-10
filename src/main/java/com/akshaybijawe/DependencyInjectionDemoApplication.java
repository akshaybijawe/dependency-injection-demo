package com.akshaybijawe;

import com.akshaybijawe.controllers.ConstructorInjectedController;
import com.akshaybijawe.controllers.MyController;
import com.akshaybijawe.controllers.PropertyInjectedController;
import com.akshaybijawe.controllers.SetterInjectedController;
import com.akshaybijawe.examplebeans.FakeDataSource;
import com.akshaybijawe.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());


	}
}
