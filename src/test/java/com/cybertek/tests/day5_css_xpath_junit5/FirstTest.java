package com.cybertek.tests.day5_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * package always LowerCase
 * class name always UpperCase
 */

public class FirstTest {


    //Test method is annotated with @Test annotation
    //Its a void method with no parameter
    @Test
    public void testAddition(){

        int num1 = 10 ;
        int num2 = 7 ;
        int expectedResult = 17 ;
        Assertions.assertEquals(expectedResult , num1+num2);



    }
    @Test
    public void testString(){

        String msg = "I love Selenium";
        //assert this msg equal "I love Selenium"
        //below assertEquals method accept 2parameter
        Assertions.assertEquals("I love Selenium" , msg);

       // assert this msg starts with " I love"
      // below assertTrue method accept 1 parameter as boolean
        Assertions.assertTrue(  msg.startsWith("I love"));

    }


}



