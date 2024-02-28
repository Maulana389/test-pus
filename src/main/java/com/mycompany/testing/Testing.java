/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testing;

/**
 *
 * @author Maulana
 */
public class Testing {
//CONSTRUCTOR
    public static void main(String[] args) {
       var person1 = new Person("udin","tangerang");
        System.out.println(person1.name);
        System.out.println(person1.country);
        person1.sayHello("maulana");
    }
}
