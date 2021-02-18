/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mo04gw
 */
public class TwoNumbersApplication 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        TwoNumbers a = new TwoNumbers(12,18);
        TwoNumbers b = new TwoNumbers(17,17);
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println("\nSUM - Object a values (12,18) added to those of new object c (8,2): ");
        TwoNumbers c = new TwoNumbers(8, 2);
        c = c.addSum(a);
        System.out.println(c);
             
        System.out.println("\nAdd Object - Object b values (17,17) added to those of a (12,18): ");
        a.addObject(b);
        System.out.println(a);
        
        
        System.out.println("\nAdd numbers manually to existing object values: ");
        a.addNumbers();
        System.out.println(a);
    }
    
}
