package com.example.stream_two;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamTwoApplication.class, args);
	}

}
