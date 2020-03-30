package com.jospino.springboot.app.hello.world.heureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootServicioHelloWorldEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioHelloWorldEurekaApplication.class, args);
	}

}
