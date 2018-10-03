/*
October 3, 2018
Callum MacLeod
U1 A2
 */

package incometax;//importing packages
import java.text.DecimalFormat;
import java.util.Scanner;

public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);//setting up scanner
        double num1;//declaring variables
        DecimalFormat x;//setting up deciaml format
        x = new DecimalFormat ("########.##");
        final double TAX1, TAX2, TAX3, TAX4, TAX5;
        final double TAX1_THRESH, TAX2_THRESH, TAX3_THRESH, TAX4_THRESH;
        final double TAX_ANS1, TAX_ANS2, TAX_ANS3, TAX_ANS4;
        
        TAX1 = 0.15;//Declaring Tax values
        TAX2 = 0.25;
        TAX3 = 0.26;
        TAX4 = 0.29;
        TAX5 = 0.33;
        
        TAX1_THRESH = 46605;//Setting tax thresholds
        TAX2_THRESH = 93608;
        TAX3_THRESH = 144489;
        TAX4_THRESH = 205842;
        
        TAX_ANS1 = TAX1*TAX1_THRESH;//Finding the answer for different tax values
        TAX_ANS2 = TAX2*(TAX2_THRESH-TAX1_THRESH)+TAX_ANS1;
        TAX_ANS3 = TAX3*(TAX3_THRESH-TAX2_THRESH)+TAX_ANS2;
        TAX_ANS4 = TAX4*(TAX4_THRESH-TAX3_THRESH)+TAX_ANS3;
       
        
        System.out.println("Enter your yearly salary:");//intro line
        num1=keyedInput.nextInt();//scanning written line
        /*following lines take the salary you input then depending on how big the number 
        is it will find its threshold and add on the other tax threshold answers
        */
        if (num1 <= TAX1_THRESH){
            System.out.println("Your Income Tax Owed Is: "+x.format(num1*TAX1)+"$");
        }
            if (num1 > TAX1_THRESH && num1 < TAX2_THRESH){
            System.out.println("Your Income Tax Owed Is: "+x.format((num1-TAX1_THRESH)*TAX2+TAX_ANS1)+"$");   
        }
                if (num1 > TAX2_THRESH && num1 < TAX3_THRESH){
            System.out.println("Your Income Tax Owed Is: "+x.format((num1-TAX2_THRESH)*TAX3+TAX_ANS2)+"$");   
        }
                    if (num1 > TAX3_THRESH && num1 < TAX4_THRESH){
            System.out.println("Your Income Tax Owed Is: "+x.format((num1-TAX3_THRESH)*TAX4+TAX_ANS3)+"$");   
        }
                       if (num1 >= TAX4_THRESH){
            System.out.println("Your Income Tax Owed Is: "+x.format((num1-TAX4_THRESH)*TAX5+TAX_ANS4)+"$");   
        }
        }
    }
   

