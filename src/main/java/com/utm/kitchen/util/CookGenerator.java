package com.utm.kitchen.util;

import com.utm.kitchen.model.Cook;

import java.util.ArrayList;
import java.util.List;

public class CookGenerator {

    public static List<Cook> generateCooks() {

        List<Cook> cooks = new ArrayList<>();

        cooks.add(new Cook(1,
                1,
                "Jason Rivera",
                "Here to deserve you",
                false)
        );
        cooks.add(new Cook(2,
                2,
                "Ana Harkness",
                "Woman power",
                false)
        );
        cooks.add(new Cook(3,
                3,
                "Andrey Dernov",
                "mi ruskie",
                false)
        );
        cooks.add(new Cook(3,
                4,
                "Mustafa Coklin",
                "cok guzel",
                false)
        );

        return cooks;
    }
}
