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

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private int menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, int _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public int getmenuPrice() {return menuPrice; }
    public void setmenuPrice(int _menuPrice) {this.menuPrice = _menuPrice; }

    public static void listMenu(ArrayList<Menu> mList) {
        for (Menu menu: mList) {
            System.out.println("Menu ID " + menu.getmenuId());
            System.out.println("Pizza type: " + menu.getmenuItem());
            System.out.println("Price: " + menu.getmenuPrice());
        }
    }

}