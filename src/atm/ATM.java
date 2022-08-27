/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author acer
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    private double balance;
    private double depositAmount;
    private double widthdrrawAmount;

    public ATM() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWidthdrrawAmount() {
        return widthdrrawAmount;
    }

    public void setWidthdrrawAmount(double widthdrrawAmount) {
        this.widthdrrawAmount = widthdrrawAmount;
    }

    public ATM(double balance, double depositAmount, double widthdrrawAmount) {
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.widthdrrawAmount = widthdrrawAmount;
    }
    
    
    
    
}
