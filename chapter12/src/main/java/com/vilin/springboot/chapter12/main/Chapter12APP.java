package com.vilin.springboot.chapter12.main;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import javax.sound.midi.Soundbank;

@SpringBootApplication(scanBasePackages = "com.vilin.springboot.chapter12")
public class Chapter12APP {
    public static void main(String[] args) {

//        SpringApplication.run(Chapter12APP.class);

        PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder("uvwxyz");
        String password1 = passwordEncoder.encode("12345");
        String password2 = passwordEncoder.encode("abc123");
        System.out.println(password1);
        System.out.println(password2);
    }
}
