/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.facadedemo;

/**
 *
 * @author chandunigamage
 */
public class Tuner {
    String description;

    public Tuner(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
    
}
