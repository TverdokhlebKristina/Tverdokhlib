package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kristina_Tverdokhlib on 9/7/2016.
 */
public class getValueTest {
    @Test
    public void getValueFromIndex() {
        int index = 0;
        int[] array = {2, 3, 5, 6, 7};
        getValue getValue = new getValue ();
        int result = getValue.getValueFromIndex (index, array);
        Assert.assertEquals (2, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getValueIndexOutOfBounds() throws Exception {
        int index = 10;
        int[] array = {2, 3, 5, 6, 7};
        getValue getValue = new getValue ();
        int result = getValue.getValueFromIndex (index, array);
        // Assert.assertEquals ();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getValueIndexOutOfBounds1() throws Exception {
        int index1 = 0;
        int[] array1 = {};

        getValue getValue = new getValue ();
        int result1 = getValue.getValueFromIndex (index1, array1);
        //Assert.assertEquals (5, result1);

    }
}