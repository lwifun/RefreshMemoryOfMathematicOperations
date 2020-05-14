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
public class Student extends Person{
    String School;
    int term;
    
    Student(String firstName, String lastName, String school, int term){
        super.firstName = firstName;
        super.lastName = lastName;
        
        this.School = school;
        this.term = term;
    }
}
