import com.example.demo.FizzBuss;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void input_1_Return_1() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(1);
        Assert.assertEquals("1", actualResult);
    }

    @Test
    public void input_2_Return_2() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(2);
        Assert.assertEquals("2", actualResult);
    }


    @Test
    public void input_3_Return_Fizz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(3);
        Assert.assertEquals("Fizz", actualResult);
    }

    @Test
    public void input_4_Return_4() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(4);
        Assert.assertEquals("4", actualResult);
    }

    @Test
    public void input_5_Return_Buzz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(5);
        Assert.assertEquals("Buzz", actualResult);
    }

    @Test
    public void input_6_Return_Fizz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(6);
        Assert.assertEquals("Fizz", actualResult);
    }

    @Test
    public void input_7_Return_7() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(7);
        Assert.assertEquals("7", actualResult);
    }

    @Test
    public void input_9_Return_Fizz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(9);
        Assert.assertEquals("Fizz", actualResult);
    }

    @Test
    public void input_10_Return_Buzz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(10);
        Assert.assertEquals("Buzz", actualResult);
    }

    @Test
    public void input_15_Return_FizzBuzz() {
        FizzBuss fizzBuzz = new FizzBuss();
        String actualResult = fizzBuzz.say(15);
        Assert.assertEquals("FizzBuzz", actualResult);
    }
}
