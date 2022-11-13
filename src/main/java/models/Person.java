/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author MoaathAlrajab
 */
public class Person {
    private SimpleStringProperty name;
    private SimpleStringProperty major;
    private int age;

    public Person(String name, String Major, int age) {
        this.name = new SimpleStringProperty(name);
        this.major = new SimpleStringProperty(Major);;
        this.age = age;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String newName) {
        //this.name = name;
        name.set(newName);
    }

    public String getMajor() {
        return major.get();
    }

    public void setMajor(String Major) {
        //this.major = Major;
        major.set(Major);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        String result = 
                "Name: " + getName() + "\n" + 
                "Major: " + getMajor() + "\n" + 
                "Age: " + getAge();
        
        return result;
    }
    
}
