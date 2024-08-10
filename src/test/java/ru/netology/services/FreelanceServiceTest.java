package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    public void testCase1() {
        FreelanceService service = new FreelanceService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int result = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testCase2() {
        FreelanceService service = new FreelanceService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int result = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, result);
    }
}