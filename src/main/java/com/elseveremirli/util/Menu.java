package com.elseveremirli.util;

import com.elseveremirli.bean.Config;
import service.menu.*;
import service.inter.MenuService;

public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()),
    REGISTER(2,"Register", new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4,"Add student", new MenuAddStudentService()),
    SHOW_ALL_STUDENT(5,"Show students ", new MenuShowStudentService()),
    SHOW_ALL_TEACHER(6,"Show teachers", new MenuShowTeacherService()),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;
    Menu(int number,String label, MenuService service) {
        this.label=label;
        this.service=service;
        this.number=number;
    }

    Menu() {

    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString(){
        return number+"."+label;
    }


    public void process(){
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber(){
        return number;
    }

    public static Menu find(int number){
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (menu.getNumber() == number) {
                return menu;
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showMenu(){
        Menu[] menus = Menu.values();
        for(Menu menu : menus){
            if(menu != UNKNOWN){
                if(menu==LOGIN || menu == REGISTER ){
                    if(!Config.isLoggedIn()){
                        System.out.println(menu);
                    }
                }else{
                    if(Config.isLoggedIn()){
                        System.out.println(menu);
                    }
                }


            }
        }
    }

}
