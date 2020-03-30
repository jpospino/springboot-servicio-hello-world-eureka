package com.jospino.springboot.app.hello.world.heureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class SpringbootServicioHelloWorldEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioHelloWorldEurekaApplication.class, args);
	}

}
