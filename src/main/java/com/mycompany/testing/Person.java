/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testing;

/**
 *
 * @author Maulana
 */
//construtor
public class Person {
    String name;
    String address;
    final String country = "indonesia";
    
    Person(String paramName,String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    
    void sayHello(String paramName){
        System.out.println("hello " + paramName + " my name is " + name + " berlamat " + address);
    }
}
