package org.example.salary;

public class ContractWorker implements CalcSalary{
    private double yearPay;
    private String name;

    public ContractWorker(String name,double yearPay)
    {
        this.name = name;
        this.yearPay = yearPay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcMonth() {
        return yearPay/12 * 0.65;
    }
}
