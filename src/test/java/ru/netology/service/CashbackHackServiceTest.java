package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import  org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void AmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void TestAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4200;

        int actual = service.remain(amount);
        int expected = 800;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void TestBoundaryEqualsAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }
}