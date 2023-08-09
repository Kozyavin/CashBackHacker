package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashbackHackServiceTest {
    /////////////////////////////////////JUnit Jupiter////////////////////////////
    @Test
    public void AmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void TestAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4200;

        int actual = service.remain(amount);
        int expected = 800;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestBoundaryEqualsAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
    /////////////////////////////////////////////JUnit4//////////////////////////////////////////////
    @Test
    public void AmountLessBoundary1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void TestAmountMoreBoundary2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestBoundaryEqualsAmount3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }
}
