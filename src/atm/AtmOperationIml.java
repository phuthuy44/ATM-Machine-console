/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author acer
 */
public class AtmOperationIml implements AtmOperationInter {
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBlance() {
       
        System.out.println("Available Balance is: "+ atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount <= atm.getBalance()){
           ministmt.put(withdrawAmount,"Amount Withdrawn");
            System.out.println("Collect the cash"+withdrawAmount);
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBlance();
        }else{
            System.out.println("Insufficient Blance!!!");
        }
        }else{
            System.out.println("Please enter the amount in multipal of 500!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount Deposited");
       System.out.println(depositAmount+" Deposited Successfully!!!");
       atm.setBalance(atm.getBalance()+depositAmount);
       viewBlance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
    
}
