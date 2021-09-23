package com.bezkoder.spring.jwt.mongodb;

import com.bezkoder.spring.jwt.mongodb.filter.ErrorFilter;
import com.bezkoder.spring.jwt.mongodb.filter.PostFilter;
import com.bezkoder.spring.jwt.mongodb.filter.PreFilter;
import com.bezkoder.spring.jwt.mongodb.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class SpringBootSecurityJwtMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtMongodbApplication.class, args);
	}

	@Bean
	public PostFilter getPostFilter(){
		return new PostFilter();
	}

	@Bean
	public ErrorFilter getErrorFilter(){
		return new ErrorFilter();
	}

	@Bean
	public PreFilter getPreFilter(){
		return new PreFilter();
	}

	@Bean
	public RouteFilter getRouteFilter(){
		return new RouteFilter();
	}

}
