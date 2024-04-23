package com.github.dalwid.conversor.main;

import com.github.dalwid.conversor.assembler.Menu;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        var menu = new Menu();
        menu.menu();
    }
}
