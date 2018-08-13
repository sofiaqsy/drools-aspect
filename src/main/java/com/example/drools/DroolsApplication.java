package com.example.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Habilita la compatibilidad con los componentes marcados con el manejo de AspectJ @Aspectanotación.  Para ser utilizado en @ Configuration
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsApplication.class, args);

	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
