import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;





public class UtilStringTest  {

    @Test
    public void isStringconcatAndReverse() {
        String aktuel = UtilString.concatAndReverse("hello ", "World ");
        String expected = "WORLD HELLO ";
        Assert.assertEquals(expected, aktuel);

    }

    @Test

    public void isLineReverce(){

        String aktual = UtilString.getReversLine("I like");
        String expected = "I ekil ";
        Assert.assertEquals(expected, aktual);


    }



}