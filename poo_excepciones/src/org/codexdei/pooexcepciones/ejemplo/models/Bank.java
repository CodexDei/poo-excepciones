package org.codexdei.pooexcepciones.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    AccountBank accountsBanks;

    public Bank(AccountBank accountsBanks) {

        this.accountsBanks = accountsBanks;
    }

    public AccountBank getAccountsBanks() {
        return accountsBanks;
    }

    public void setAccountsBanks(AccountBank accountsBanks) {
        this.accountsBanks = accountsBanks;
    }
}
