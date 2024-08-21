package com.saretto.propostaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.NumberFormat;
import java.util.Locale;
@SpringBootApplication
@EnableScheduling
public class PropostaAppApplication {


    public static void main(String[] args) {
		SpringApplication.run(PropostaAppApplication.class, args);
	}

}
