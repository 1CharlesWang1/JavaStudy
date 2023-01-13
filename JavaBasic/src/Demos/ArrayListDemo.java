package Demos;

import ATMDemo.Account;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(123);
//        arrayList.add("qwe");
//        arrayList.add(1, "ert");
//        System.out.println(arrayList);
//
////        泛型
//        ArrayList<String> arrL1 = new ArrayList<>();
//
//        ArrayList<Integer> arrL2 = new ArrayList<>();
//
//        ArrayList<Object> arrL3 = new ArrayList<>();
//        arrL3.add("123");
//        arrL3.add(123);
//
//
//        Object e = arrayList.get(1);
//        System.out.println(e);
//
//        System.out.println(arrayList.size());
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        arrayList.remove(1);
//        arrayList.remove("qwe");
//        arrayList.set(0,"hhh");
//        System.out.println(arrayList);

        ArrayList<Account> accounts = new ArrayList<>();

        Account account = new Account();
        Account account2 = new Account();

        account.setId("123");
        account.setUsername("123");
        account2.setMoney(100);
        accounts.add(account);
        accounts.add(account2);

//        accounts.remove(account);

        System.out.println(accounts);


    }
}
