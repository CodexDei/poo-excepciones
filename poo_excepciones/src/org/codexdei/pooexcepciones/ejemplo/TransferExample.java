package org.codexdei.pooexcepciones.ejemplo;

import org.codexdei.pooexcepciones.ejemplo.models.AccountBank;
import org.codexdei.pooexcepciones.ejemplo.models.Bank;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TransferExample {

    public static void main(String[] args) {

        List<Bank> accountsBanks = new ArrayList<>();

        accountsBanks.add(new Bank(new AccountBank(112254754,1000000)));
        accountsBanks.add(new Bank(new AccountBank(112258541,2000000)));
        accountsBanks.add(new Bank(new AccountBank(113547854,3000000)));
        accountsBanks.add(new Bank(new AccountBank(785412254,4000000)));
        accountsBanks.add(new Bank(new AccountBank(588455655,5000000)));

        long numberAccountUser = Integer.parseInt(JOptionPane.showInputDialog("Into number account bank:"));


        transferUser(accountsBanks,numberAccountUser);


    }

    public static void transferUser (List<Bank> accountsBanks, long numberAccountUser){

        boolean validationAccount = accountsBanks.stream()
                .map(bank -> bank.getAccountsBanks())
                .map(accountBank -> accountBank.getNumberAccount() == numberAccountUser)
                .reduce();

    }
}
