package collazo.albert.SumOfTheNumbersTest;

import static org.junit.Assert.*;

import collazo.albert.SumOfTheNumbers.SumOfTheNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SumOfTheNumbersTest {

    SumOfTheNumbers sumOfTheNumbers;

    @Before
    public void setUp(){
        sumOfTheNumbers = new SumOfTheNumbers();
    }

    @Test
    public void sumFunctionTest(){
        Integer expected = 15;
        Integer actual = sumOfTheNumbers.sumFunction(5);
        Assert.assertEquals(actual, expected);

    }

}
