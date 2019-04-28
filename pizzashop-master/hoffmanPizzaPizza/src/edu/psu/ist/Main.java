package com.company;

/*
Project: Lab 10
Purpose Details: Pizza Shop Refactoring
Course: IST 242
Author: Virginia Hoffman
Date Developed: 3/17/19
Last Date Changed: 3/26/19
Rev: 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private int cCount = 1;

    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1, order1, PaymentType.cash);

        Menu menu1 = new Menu(1, "Plain", 10);
        Menu menu2 = new Menu(2, "Meat", 11);
        Menu menu3 = new Menu(3, "Extra", 13);
        Menu menu4 = new Menu(4, "Veg", 8);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        oList.add(order1);
        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRNT:
                    Customer.printCustomer(cList);
                    break;
                case MENU_CODE:
                    Menu.listMenu(mList);
                    break;
                case ORDE_CODE:
                    oList.add(main.addOrder());
                    break;
                /*case ORDE_PRNT:
                    Menu.printOrder(oList);
                    break;*/
                case TRAN_CODE:
                    Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }


    public Order addOrder() {
        Order menu = new Order(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter Order ID: ");
        menu.setorderId(scnr.nextInt());
        System.out.println("Please Enter quantity: ");
        menu.setItemQuantity(scnr.nextInt());
        return menu;
    }

}