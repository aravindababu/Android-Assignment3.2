/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boolean2;

/**
 *
 * @author user2
 */
public class Boolean2 {
    
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating a boolean of Same
        boolean Same;
        //Creating String Values and assigning Values to them
        String S2="Hello";
        String S1="Hello";
        
        //Using ternary operator and returning the boolean value
        
        Same=(S1==S2)? true:false;
        System.out.println(Same);
        
    }
    
}
