package com.eli920.controlgastos;

import com.eli920.controlgastos.model.Categoria;
import com.eli920.controlgastos.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControlGastosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlGastosApplication.class, args);
    }


   
}
