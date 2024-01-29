package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline(); //В данном случае, без инициализации тесты не проходят!
    private final String expected = "Кошачьи";
    private final int numberOfKittens = 1;
    private final int countOfKittens = 7;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyTest(){
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        int actual = feline.getKittens();
        assertEquals(numberOfKittens, actual);
    }

    @Test
    public void getKittensCountTest() {
        int actual = feline.getKittens(countOfKittens);
        assertEquals(countOfKittens, actual);
    }
}
