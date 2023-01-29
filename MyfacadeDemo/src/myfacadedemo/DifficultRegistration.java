/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfacadedemo;

public class DifficultRegistration {
    //charater array to store reg no as characters
    char regNo[] = new char[11];
    
    //setting 1st character
    public void setFirstRegNoCharacter(char c){
        regNo[0]  = c; 
    }
    
    //setting 2nd character
    public void setSecondRegNoCharacter(char c){
        regNo[1]  = c; 
    }
    
    //setting 3rd character
    public void setThirdRegNoCharacter(char c){
        regNo[2]  = c; 
    }
    
    
    //setting 4th character
    public void setFourthRegNoCharacter(char c){
        regNo[3]  = c; 
    }    
    
    //setting 5th character
    public void setFifthRegNoCharacter(char c){
        regNo[4]  = c; 
    }
    
    
    //setting 6th character
    public void setSixthRegNoCharacter(char c){
        regNo[5]  = c; 
    }
    
    
    //setting 7th character
    public void setSeventhNoCharacter(char c){
        regNo[6]  = c; 
    }
    
    
    //setting 8th character
    public void setEighthRegNoCharacter(char c){
        regNo[7]  = c; 
    }
    
    
    //setting 9th character
    public void setNinthNoCharacter(char c){
        regNo[8]  = c; 
    }
    
    
    //setting 10th character
    public void setTenthRegNoCharacter(char c){
        regNo[9]  = c; 
    }
    
    
    //setting 11th character
    public void setElevanthRegNoCharacter(char c){
        regNo[10]  = c; 
    }   
    
    
    //return registration no as a string
    public String getRegNo(){
        return new String(regNo);
    }
}
