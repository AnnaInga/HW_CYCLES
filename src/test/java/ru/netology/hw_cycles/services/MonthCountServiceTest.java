package ru.netology.hw_cycles.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class MonthCountServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/values.csv")
    public void testFirst(int expected, int income, int expenses, int threshold) {

        MonthCountService service = new MonthCountService();

//        int expected = 3;
//        int income = 10000; //доход
//        int expenses = 3000; //месячные траты
//        int threshold = 20000; //можно отдохнуть

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void testSecond() {
//
//        MonthCountService service = new MonthCountService();
//
//        int expected = 2;
//        int income = 100000; //доход
//        int expenses = 60000; //месячные траты
//        int threshold = 150000; //можно отдохнуть
//
//        int actual = service.calculate(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }


}
