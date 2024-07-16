package org.example.salary;

import java.util.Scanner;

public class PartTimer implements CalcSalary {

    private int hourPay;
    private String name;
    private int time;

    Scanner scanner;

    public PartTimer(String name, int hourPay, int time) {
        this.hourPay = hourPay;
        this.time = time;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcMonth() {
        return hourPay * time;
    }
}
