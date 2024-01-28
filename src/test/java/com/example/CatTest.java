package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }
  //  Cat cat = new Cat(feline);
    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFood() throws Exception{
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
