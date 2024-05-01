package service.menu;

import com.elseveremirli.bean.Config;
import service.inter.MenuLoginServiceInter;

import java.util.Scanner;


public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("username:");
        String username = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("password:");
        String password = scanner1.nextLine();

        if( !(username.equals("user")  && password.equals("11111")) ){
            throw new IllegalArgumentException("Username or passowrd is invalid");
        }
        Config.setLoggedIn(true);
    }
}
