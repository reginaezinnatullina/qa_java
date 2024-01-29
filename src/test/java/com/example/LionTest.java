package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    private final int numberOfKittens = 1;
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }
    @Test(expected = Exception.class)
    public void doesHaveManeTestThrowException() throws Exception{
        Lion lion = new Lion("Дитя", feline);
    }
}
