package com.cybertek.tests.day10_driver_method_practice_properties;

import org.junit.jupiter.api.Test;

public class FakerTest {

    @Test
    public void testFakeData(){

        Faker faker = new Faker();

        System.out.println("faker.book().title() = " + faker.book().title());
        System.out.println("faker.book().author() = " + faker.book().author() );
        System.out.println("faker.gameOfThrones().character() = " + faker.gameOfThrones().character());
        System.out.println("faker.phoneNumber().phoneNumber() = " + faker.phoneNumber().cellPhone());
        System.out.println("faker.idNumber().ssnValid() = " + faker.idNumber().ssnValid());
        System.out.println("faker.number().numberBetween(1000000000L,5000000000L) = " + faker.number().numberBetween(1000000000L, 5000000000L));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        // and more
    }
}
