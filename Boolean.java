/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

/**
 *
 * @author user2
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        //Using the "equals" method in JAVA to return boolean value
        
        //Creating a boolean of Same
        boolean Same;
        //creating 3 String objects S1,S2,S3 and assigning Values to them
        String S1=new String("Hello");
        String S2=new String("Hello");
        String S3=new String("Hi");
        
        //Comparing S1 with S2 and Assigning the result to the boolean variable Same
        //if both the strings are true it will return "true" to the boolean Value
        //if strings are not same it will return "false" to the boolean
        
        //Using equals method and returning boolean value
        
        Same=S1.equals(S2);
        System.out.println(Same);
        
        //Comparing S1 with S2 and Assigning the result to the boolean variable Same
        //if both the strings are true it will retutn "true" to the boolean Value 
        //if strings are not same it will return "false" to the boolean
        
        Same=S1.equals(S3);
        System.out.println(Same);
        
    } 
    
}
