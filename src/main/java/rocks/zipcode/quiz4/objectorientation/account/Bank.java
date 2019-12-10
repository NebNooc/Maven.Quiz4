package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void removeBankAccountByIndex(Integer indexNumber) {
        if(accounts.size() - 1 >= indexNumber)
            accounts.remove(accounts.get(indexNumber));
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }
}
