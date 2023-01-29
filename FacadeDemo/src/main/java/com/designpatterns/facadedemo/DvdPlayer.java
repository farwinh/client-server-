/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.facadedemo;

/**
 *
 * @author chandunigamage
 */
public class DvdPlayer {
        String description;;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
    }
}
