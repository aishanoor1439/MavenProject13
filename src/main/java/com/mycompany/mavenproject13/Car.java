/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

//Class Definition
public class Car {
    
//    Attributes
    private String model;
    private int mileage;

//    Methods
    
//    Constructor
    Car() {
        this.model = "Unknown Model";
        this.mileage = 0;
        System.out.println("A new car model has been created with default values.");
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage);
    }

}
