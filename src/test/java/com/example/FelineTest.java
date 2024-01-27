package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline = new Feline();

    Animal animal = new Animal();

    private final String expected = "Кошачьи";
    private final int numberOfKittens = 1;
    private final int countOfKittens = 7;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFamilyTest(){
       String actual = feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        assertEquals("Ожидается другое семейство",expected, "Кошачьи");
    }

    @Test
    public void getKittensTest() {
        int actual = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        assertEquals(numberOfKittens, 1);
    }

    @Test
    public void getKittensCountTest() {
        int actual = feline.getKittens(countOfKittens);
        Mockito.verify(feline, Mockito.times(1)).getKittens(Mockito.anyInt());
        assertEquals("Количество котят не соответствует заданному", countOfKittens, 7);
    }
}
