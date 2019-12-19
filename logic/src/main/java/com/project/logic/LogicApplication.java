package com.project.logic;

import com.project.logic.domain.Business;
import com.project.logic.service.inf.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
@EntityScan(basePackages = {"com.project.logic.domain"})
@Controller
public class LogicApplication implements CommandLineRunner {

    @Autowired
    private BusinessService businessService;

    public static void main(String[] args) {
        SpringApplication.run(LogicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(Business b:businessService.findAllByNameStartWith("edward")){
           log.info(b.toString());
           log.info(b.getDocumentNumber());
           log.info(b.getCreatedDate().toString());
        }
    }
}
