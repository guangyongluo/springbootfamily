package com.vilin.springboot;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

//@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

//    @Bean
//    public RouterFunction<ServerResponse> helloWorld(){
//        return route(GET("/hello-world"),
//                request -> ok().body(Mono.just("Hello, World"), String.class)
//        );
//    }

//    @Bean
//    public ApplicationRunner runner(WebServerApplicationContext context) {
//        return args -> {
//            System.out.println("当前 WebServer 实现类为："
//                    + context.getWebServer().getClass().getName());
//        };
//    }

//    @EventListener(WebServerInitializedEvent.class)
//    public void noWebServerReady(WebServerInitializedEvent event){
//        System.out.println("当前 WebServer 实现类为："
//                + event.getWebServer().getClass().getName());
//    }
}
