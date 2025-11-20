package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldNotGiveAdvice() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldGiveAdvice() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    //Аннотация @Test должна иметь Fully Qualified Name org.junit.Test.
    //Asserts расположены в классе org.junit.Assert.

}