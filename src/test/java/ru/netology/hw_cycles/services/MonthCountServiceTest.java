package ru.netology.hw_cycles.services;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
public class MonthCountServiceTest {

    @Test
    public void test() {

        MonthCountService service = new MonthCountService();

        int expected = 3;
        int income = 10000; //доход
        int expenses = 3000; //месячные траты
        int threshold = 20000; //можно отдохнуть

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
