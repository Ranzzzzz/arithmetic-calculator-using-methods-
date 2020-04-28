package renew;
import java.util.Scanner;

public class ReNew{
    Scanner input = new Scanner(System.in);
    
    // This is the method for Addition, Code By: QUEL
    public void addition(){
        int num1Add, num2Add, sum;
        
        System.out.println("Enter 2 numbers to add");
        System.out.println("First Number: ");
        num1Add = input.nextInt();
        System.out.println("Second Number: ");
        num2Add = input.nextInt();
        sum = num1Add + num2Add;
        
        System.out.println("The sum is: " + sum);
    }
    
    // This is the method for Subtraction, Code By: GAB
    public void subtraction(){
        int num1Sub, num2Sub, diff;
        
        System.out.println("Enter 2 numbers to subtract");
        System.out.println("First Number: ");
        num1Sub = input.nextInt();
        System.out.println("Second Number: ");
        num2Sub = input.nextInt();
        diff = num1Sub - num2Sub;
        
        System.out.println("The difference is: " + diff);
    }
    
    
    
    
    
    // This is the method for Multiplication, Code By: LANZ
    public void multiplication(){
        int uno,dos,resultado;
        
        System.out.println("Enter 2 numbers to multiply");
        System.out.println("First Number: ");
        uno = input.nextInt();
        System.out.println("Second Number: ");
        dos = input.nextInt();
        resultado = uno * dos;
        
        System.out.println("The product is: " + resultado);
    }
    
    
    
    // This is the method for Division
    
    /*By Rashed*/
    public static void division(){
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }
    
    
    
    public static void main(String[]Args){
        ReNew object = new ReNew();
        object.addition(); //calling the method addition
        object.subtraction(); //calling the method subtraction
        object.multiplication(); //calling the method multiplication
        object.division(); //calling the method division
    }
}
