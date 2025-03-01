package org.codexdei.pooexcepciones.ejemplo.models;

import org.codexdei.pooexcepciones.ejemplo.exceptions.TransferExceptions;
import org.codexdei.pooexcepciones.ejemplo.interfaces.Transfers;

import javax.swing.*;

public class AccountBank implements Transfers {

    private long numberAccount;
    private double balance;

    public AccountBank(long numberAccount, double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBank{" +
                "numberAccount=" + numberAccount +
                ", balance='" + balance + '\'' +
                '}';
    }



    @Override
    public double withDraw(double amount) throws TransferExceptions {

        if (amount >= 0){

            new TransferExceptions("The amount cannot be negative or less than zero");

            return 0;
        
        } else if ( this.balance < amount) {

            new TransferExceptions("Insufficient Balance");

            return 0;

        } else {

            return this.balance - amount;
        }
    }

    @Override
    public double deposit(double amount) {

        if (amount >= 0){

            new TransferExceptions("The amount cannot be negative or less than zero");

            return 0;

        } else if ( this.balance < amount) {

            new TransferExceptions("Insufficient Balance");

            return 0;

        } else {

            return this.balance + amount;
        }
    }

    @Override
    public void tranfer() {





        long mountAccountUser = Integer.parseInt(JOptionPane.showInputDialog("Into amount tranfer:"));


        int option = Integer.parseInt(JOptionPane.showInputDialog("What transaction you'd like to make?\n\n" +
                "1. With Draw\n" +
                "2. Deposit"));

        switch (option){


        }
    }
}
