package ru.netology.javaqa;

public class MoneyService {
    public int calculate(int income, int expenses, int threshold) {
        int netIncome = income - expenses;
        if (netIncome < threshold) {
            return 0; // не достигает порога
        } else if (netIncome == threshold) {
            return 1; // достигает порога
        } else {
            return 2; // превышает порог
        }
    }
}