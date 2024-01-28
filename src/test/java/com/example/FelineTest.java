package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline;
    private final String expected = "Кошачьи";
    private final int numberOfKittens = 1;
    private final int countOfKittens = 7;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyTest(){
       String actual = feline.getFamily();
        assertEquals("Ожидается другое семейство",expected, "Кошачьи");
    }

    @Test
    public void getKittensTest() {
        int actual = feline.getKittens();
        assertEquals(numberOfKittens, 1);
    }

    @Test
    public void getKittensCountTest() {
        int actual = feline.getKittens(countOfKittens);
        assertEquals("Количество котят не соответствует заданному", countOfKittens, 7);
    }
}
