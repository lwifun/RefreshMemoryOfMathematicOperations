/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refreshmemory;

/**
 *
 * @author lwifu
 */
public class Person {
    int dateOfBirth;
    String city, lastName, firstName;
    
    int a = 23;
    
    void say(String string){
        System.out.println(string);
    }
    
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    Person(){
    
    }
}
