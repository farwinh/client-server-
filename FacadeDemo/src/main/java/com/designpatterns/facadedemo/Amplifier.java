/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpatterns.facadedemo;

/**
 *
 * @author chandunigamage
 */
public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvdPlayer;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println(description + " setting DVD player to " + dvdPlayer);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println(description + " setting tuner to " + dvdPlayer);
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

}
