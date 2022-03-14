package Taschenrechner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestUnion {

    @Test
    public void testUnion() {
        Rechnungen test = new Rechnungen();

        String input1 = "1, 2, 3, 4";
        String input2 = "3, 4, 5, 6";

        ArrayList<Integer> actualOutput = test.rechneVereinigung(input1, input2);
        ArrayList<Integer> expectedOutput = new ArrayList<>();

        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(4);
        expectedOutput.add(5);
        expectedOutput.add(6);

        assertEquals(expectedOutput, actualOutput);
    }

}