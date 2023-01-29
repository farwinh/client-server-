/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfacadedemo;

import java.util.Scanner;

public class MyfacadeDemo {
    public static void main(String[] args) {
        DifficultRegistration dr = new DifficultRegistration();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter first  character of Registration Number :");
        dr.setFirstRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter second  character of Registration Number :");
        dr.setSecondRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter third  character of Registration Number :");
        dr.setThirdRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter fourth  character of Registration Number :");
        dr.setFourthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter fifth  character of Registration Number :");
        dr.setFifthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter sixth  character of Registration Number :");
        dr.setSixthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter seventh  character of Registration Number :");
        dr.setSeventhNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter eightth  character of Registration Number :");
        dr.setEighthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter ninth  character of Registration Number :");
        dr.setNinthNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter tenth  character of Registration Number :");
        dr.setTenthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Please enter elevanth  character of Registration Number :");
        dr.setElevanthRegNoCharacter(input.next().charAt(0));
        
        System.out.println("Your Registration Number is :" + dr.getRegNo());
        
    }
    
}
