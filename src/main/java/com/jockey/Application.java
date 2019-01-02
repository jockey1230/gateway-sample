package com.jockey;

import com.jockey.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangtao
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private GatewayService gatewayService;

    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }

    @GetMapping("/sample1")
    public String sample1() {
        return gatewayService.sample1();
    }

}
