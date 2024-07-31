/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package min_max;
import java.util.Scanner;
/**
 *
 * @author Ihartley
 */
public class Min_Max {
    
    public static void main(String[] args) {
        
        boolean on = true;
        boolean nxt = false;
        double max = 0;
        double min = 0;
        
        while(on){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a value: ");
            String value = input.nextLine();
        
            try{
                double var = Integer.parseInt(value);
                if (nxt)
                {
                    if (max>var)  
                    {
                        min = var;
                    }
                }
                if (max<var)
                {
                    max = var;
                }
 
                System.out.println("The max value is: "+max+"\nThe min value is: "+min);
                nxt = true;
            }
            catch(NumberFormatException var){
                System.out.println("Input Invalid");
                on = false;
            }
        }
    }
}
