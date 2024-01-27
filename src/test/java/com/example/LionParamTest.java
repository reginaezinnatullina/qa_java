package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class LionParamTest {
    @Spy
    Feline feline = new Feline();
    private final boolean expected;
    private final String checkedText;

    public LionParamTest(String checkedText, boolean expected) throws Exception {
        this.checkedText = checkedText;
        this.expected = expected;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getResult() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(checkedText, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}
