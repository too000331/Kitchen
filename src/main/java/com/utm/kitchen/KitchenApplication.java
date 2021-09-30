package com.utm.kitchen;

import com.utm.kitchen.service.KitchenService;
import com.utm.kitchen.util.CookGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KitchenApplication {

    public static void main(String[] args) {
        SpringApplication.run(KitchenApplication.class, args);

        KitchenService kitchenService = KitchenService.getInstance();
        kitchenService.openKitchen();

    }
}