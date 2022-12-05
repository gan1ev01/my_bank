package services.impl;

import classes.BankAccount;
import classes.Person;
import enums.Bank;
import services.BankAccountInterface;

import java.util.ArrayList;
import java.util.List;

public class BankAccountImpl implements BankAccountInterface {
    private List<BankAccount> bankAccounts = new ArrayList<>();
    @Override
    public String createBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "Your bank account has been opened!";
    }

    @Override
    public List<BankAccount> getAllBankAccount() {
        return bankAccounts;
    }

    @Override
    public double credit(Person person, Bank bank, int deposit, double summa) {
        double credit = (summa * deposit) / summa;
        person.getBankAccount().setBalance(person.getBankAccount().getBalance() + summa);
        System.out.println("You have been granted credit!");
        return summa+credit;
    }
}
