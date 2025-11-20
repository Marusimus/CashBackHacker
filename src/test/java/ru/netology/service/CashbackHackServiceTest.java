package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    //Аннотация @Test должна иметь Fully Qualified Name org.testng.annotations.Test.
//Asserts расположены в классе org.testng.Assert. Обратите внимание: в TestNG принято actual, expected/
//Класс и тестовые методы должны иметь модификатор доступа public.

    @org.testng.annotations.Test
    public void shouldNotGiveAdvice (){
        CashbackHackService service = new CashbackHackService ();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected =0;
        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldGiveAdvice () {
        CashbackHackService service = new CashbackHackService ();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }
}
