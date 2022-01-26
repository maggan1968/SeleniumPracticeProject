package com.cybertek.tests.day11_properties_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerTester {

    @Test
    public void testOutJavaFaker(){

        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        //fake book title
        System.out.println("faker.book().title() = " + faker.book().title());
        System.out.println("faker.book() = " + faker.book().publisher());
        System.out.println("faker.gameOfThrones().character() = "
                + faker.gameOfThrones().character());
        //fake phone number
        System.out.println("faker.phoneNumber().phoneNumber() = "
                + faker.phoneNumber().cellPhone());
        System.out.println("faker.idNumber().ssnValid() = "
                + faker.idNumber().ssnValid());
        System.out.println("faker.number().numberBetween(1000000000L,5000000000L) = "
                + faker.number().numberBetween(1000000000L, 5000000000L));
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));
        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact());

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard());

        // AS a homework , use random data to fill up practice site registration form
        // use random data to fill up the address and payment info in WebOrder site

    }
}
