package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

 @Before
 public void setUp(){
     System.out.println("\tthis is coming from BEFORE");
 }


 @After
 public void tearDown(){
        System.out.println("\tthis is coming from AFTER");
    }


 @Before("@db")
 public void setUpdb(){
     System.out.println("\t  connecting to the database...");
 }


 @After("@db")
 public void closeDb(){
        System.out.println("\t   disconnecting to database...");
    }






}
