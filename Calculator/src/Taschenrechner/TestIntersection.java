package Taschenrechner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestIntersection {

    @Test
    public void testIntersection() {
        Rechnungen test = new Rechnungen();

        String input1 = "1, 2, 3, 4";
        String input2 = "3, 4, 5, 6";

        ArrayList<Integer> actualOutput = test.rechneDurchschnitt(input1, input2);
        ArrayList<Integer> expectedOutput = new ArrayList<>();

        expectedOutput.add(3);
        expectedOutput.add(4);

        assertEquals(expectedOutput, actualOutput);
    }

}