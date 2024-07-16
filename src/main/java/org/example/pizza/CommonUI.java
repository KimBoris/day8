package org.example.pizza;

import java.util.Scanner;

public abstract class CommonUI {//객체를 만들 수 없다.
    private Scanner scanner;

    public CommonUI(Scanner scanner) {
        this.scanner = scanner;
    }

    //추상메소드 : 몸체가 없다
    public abstract void execute();

    public void print(String msg)
    {
        System.out.println(msg);
    }

    protected String inputStr(String msg)
    {
        this.print(msg);
         return scanner.nextLine();
    }

    protected  int inputInt(String msg)
    {
        return Integer.parseInt(inputStr(msg));
    }
}
