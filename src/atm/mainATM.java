/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author acer
 */
import java.util.*;
public class mainATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtmOperationInter op= new AtmOperationIml() {};
        int atmNumber=12345;
        int atmpin=123;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!!");
        System.out.println("Enter ATM number:");
        int Number=sc.nextInt();
        System.out.println("Enter pin:");
        int pin=sc.nextInt();
        if((atmNumber==Number)&&(atmpin==pin)){
            while(true){
                System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice:");
                int choice=sc.nextInt();
                if(choice==1){
                    op.viewBlance();
                    
                }else if(choice==2){
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }else if(choice==3){
                    System.out.println("Enter Amount to Deposit:");
                    double depositAmount=sc.nextDouble();//5000
                    op.depositAmount(depositAmount);
            
                }else if(choice==4){
                    op.viewMiniStatement();
                    
                }else if(choice==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM machine.");
                    System.exit(0);
                }else{
                    System.out.println("Please enter correct choice!");
                }
                
            }
        }else{
            System.out.println("Incorrect ATM number!");
            System.exit(0);
        }
        
    }
    
}
