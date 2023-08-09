package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    @Test
    public void Test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);
    }
    /*@Test
    public void Test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }*/
}