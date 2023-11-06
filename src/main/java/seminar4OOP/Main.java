package seminar4OOP;

import homework1OOP.Account;
import homework2OOP.Account.FixedAmountAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Generic
        // T type
        // E element
        // S super
        // X exception
        // R result
        // L
//        List<String> list = new ArrayList<>();
//        list.add("2");
//        list.add(2);

        Storage storage = new Storage();
        System.out.println(storage.sum());

        storage.add(1);
        storage.add(2);
        storage.add(3);

        System.out.println(storage.sum());

        List<Account> accounts = new ArrayList<>();
        List<FixedAmountAccount> fixedAmountAccounts = new ArrayList<>();

//        foo(fixedAmountAccounts);
        foo(accounts);
    }

    private static <T extends Account> void foo(List<T> accounts){

    }
}
