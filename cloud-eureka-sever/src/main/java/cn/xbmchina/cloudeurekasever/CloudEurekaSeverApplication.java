package cn.xbmchina.cloudeurekasever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaSeverApplication.class, args);
	}

}
