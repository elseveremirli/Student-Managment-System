package com.elseveremirli;

import com.elseveremirli.bean.Config;
import com.elseveremirli.util.Menu;
import com.elseveremirli.util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.showMenu();

    }
}