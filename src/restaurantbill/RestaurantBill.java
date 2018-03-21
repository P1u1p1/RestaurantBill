/*
 * Seth James England
 * 06/03/2018
 * Look ma I made a program
 */

package restaurantbill;

import java.text.DecimalFormat;
public class RestaurantBill {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // here I am declaring my variables
        double foodCost = 4.00;
        double tax = .13;
        double foodPlusTax = (foodCost*tax) + foodCost;
        double taxOfFood =  foodCost*tax;
        
        DecimalFormat x = new DecimalFormat("#.##"); // I wanted to set a decimal format for all of my code, as I found that it can be helpful when using ultiple calls with System.out.println
        // this series of System.out.println code is declaring what the recipt prints 
        System.out.println("Thank you for shopping at McDonalds");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println("Big Mac = " + x.format(foodCost));
        System.out.println("HST = " + x.format(taxOfFood));
        System.out.println("Total Cost " + (foodPlusTax));
        
        
        
    }
    
}
