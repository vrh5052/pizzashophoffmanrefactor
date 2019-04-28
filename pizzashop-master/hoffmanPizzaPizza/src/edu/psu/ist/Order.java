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

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private int itemQuantity;
    private int orderPrice;
    private int orderTotal = (itemQuantity * orderPrice);
    private Customer cust;
    private ArrayList<Menu> menuItem;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }


    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public int getItemQuantity() {return itemQuantity; }
    public void setItemQuantity(int _itemQuantity) {this.itemQuantity = _itemQuantity; }

    public int getOrderPrice() {return orderPrice; }
    public void setOrderPrice(int _orderPrice) {this.orderPrice = _orderPrice; }

    public int getOrderTotal() {return orderTotal; }
    public void setorderTotal(int _orderTotal) {this.orderTotal = _orderTotal; }

    public void printOrder(ArrayList<Order> oList, ArrayList<Menu> menuItem) {

        for (Menu menu: menuItem){
            System.out.println(menu.getmenuItem());
            System.out.println(" " + menu.getmenuItem());
            System.out.println(" " + menu.getmenuPrice());
            System.out.println(" " +menu.getmenuPrice());

        }


        switch (orderPrice)
        {
            case 1:
                orderPrice = 10;
                break;
            case 2:
                orderPrice = 11;
                break;
            case 3:
                orderPrice = 13;
                break;
            case 4:
                orderPrice = 8;
                break;

        }
    }


}