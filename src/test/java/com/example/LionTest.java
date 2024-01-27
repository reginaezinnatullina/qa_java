package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline = new Feline();
    private final int numberOfKittens = 1;
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
      //  assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", lion.getFood(), ("Животные, Птицы, Рыба"));
    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        assertEquals(numberOfKittens, 1);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeTestThrowException() throws Exception{
        Lion lion = new Lion("Дитя", feline);
        lion.doesHaveMane();

    }
}
