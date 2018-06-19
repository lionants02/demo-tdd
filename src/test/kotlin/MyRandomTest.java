import com.example.demo.IRandom;
import com.example.demo.MyRandom;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class MyRandomTest {

    @Test
    public void random5() {

        IRandom random = new Random8();
        MyRandom myRandom = new MyRandom(random);
        int actualResult = myRandom.generate();
        Assert.assertEquals(5, actualResult);
    }


    @Test
    public void random6() {

        Random6 spyRandom = new Random6();
        MyRandom myRandom = new MyRandom(spyRandom);
        int actualResult = myRandom.generate();
        Assert.assertTrue(spyRandom.call);
    }


    public class Random8 implements IRandom {

        @Override
        public int getNumber() {
            return 5;
        }
    }

    public class Random6 implements IRandom {

        public boolean call;

        @Override
        public int getNumber() {
            call = true;
            return 6;
        }
    }


}
