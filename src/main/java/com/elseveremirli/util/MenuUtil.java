package com.elseveremirli.util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu(){
        Menu.showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an option:");
        int selectedNumber = scanner.nextInt();
        Menu selectedMenu = Menu.find(selectedNumber);

        selectedMenu.process();

    }

    public static void processMenu(Menu menu){
        menu.process();
    }
}
