package com.exito.utils;

import com.exito.models.Purchases;
import com.github.javafaker.Faker;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static Purchases date()
    {
        return new Purchases(FAKER.internet().emailAddress());
    }
}
