package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyServiceTest {

    @Test
    void calculateShouldReturnZero_whenIncomeIs10KAndExpensesAre3KAndThresholdIs8K() {
        MoneyService service = new MoneyService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 8000; // изменили значение порога
        int expected = 0; // ожидаемое значение - меньше порога
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }

    @Test
    void calculateShouldReturnOne_whenIncome100K_andExpenses60K_andThreshold40K() {
        MoneyService service = new MoneyService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 40000; // изменили значение порога
        int expected = 1; // ожидаемое значение - равно порогу
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }

    @Test
    void calculateShouldReturnTwo_whenIncomeIs200KAndExpensesAre70KAndThresholdIs100K() {
        MoneyService service = new MoneyService();
        int income = 200000;
        int expenses = 70000;
        int threshold = 100000; // проверяем превышение порога
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
