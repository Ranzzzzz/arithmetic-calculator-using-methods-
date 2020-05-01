package renew;
import java.util.Scanner;

public class ReNew{
    Scanner input = new Scanner(System.in);
    
    // global variables so that every method can access it
    int num1, num2;
    
    // initialization of the class getInput
    getInput inputGet = new getInput();
   
    class getInput{
        //This is a method for getting input
        public void getUserInput(){
            System.out.print("First Number: ");
            num1 = input.nextInt();
            System.out.print("Second Number: ");
            num2 = input.nextInt();
        }
    }
    
    // This is the method for Addition, Code By: QUEL
    public void addition(){
        System.out.println("Enter 2 numbers to add");
        inputGet.getUserInput();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    
    // This is the method for Subtraction, Code By: GAB
    public void subtraction(){
        System.out.println("Enter 2 numbers to subtract");
        inputGet.getUserInput();
        int diff = num1 - num2;
        System.out.println("The difference is: " + diff);
    }
   
    // This is the method for Multiplication, Code By: LANZ
    public void multiplication(){
        System.out.println("Enter 2 numbers to multiply");
        inputGet.getUserInput();
        int resultado = num1 * num2;
        System.out.println("The product is: " + resultado);
    }
    
    // This is the method for Division, By Rashed
    public void division(){
        System.out.println("Enter two numbers to divide");
        inputGet.getUserInput();
        int quotient = num1/num2;
        System.out.println("The quotient is: " + quotient);
    }
    
    public static void main(String[]Args){
        Scanner inputChoice = new Scanner(System.in);
        ReNew object = new ReNew();
        char userChoice;
        
        System.out.print("What arithmetic function would you like to use: ");
        userChoice = inputChoice.next().charAt(0);
        
        switch(userChoice){
            case '+':
                object.addition(); //calling the method addition
                break;
                
        }    
    }
}
