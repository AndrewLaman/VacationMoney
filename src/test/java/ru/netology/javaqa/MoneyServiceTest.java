package ru.netology.javaqa;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/bonus.csv")
    public void calculateShouldReturnZero_whenIncomeIs10KAndExpensesAre3KAndThresholdIs8K() {
        MoneyService service = new MoneyService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 8000;
        int expected = 0;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/bonus.csv")
    public void calculateShouldReturnOne_whenIncome100K_andExpenses60K_andThreshold40K() {
        MoneyService service = new MoneyService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 40000;
        int expected = 1;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/bonus.csv")
    public void calculateShouldReturnTwo_whenIncomeIs200KAndExpensesAre70KAndThresholdIs100K() {
        MoneyService service = new MoneyService();
        int income = 200000;
        int expenses = 70000;
        int threshold = 100000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/bonus.csv")
    public void calculate(int income, int expenses, int threshold, int expected) {
        MoneyService service = new MoneyService();
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}