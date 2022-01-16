package ru.vsu.cs.okshina_v_a;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.okshina_v_a.utils.ArrayUtils;

public class TestOfFindingPoints {
    FindingPoints findingPoints = new FindingPoints();

    @Test
    public void testArrayWithoutEnoughValidPoints() {
        int[][] testingInputArray = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingArrayWithoutEnoughValidPoints.txt");
        int[][] actualArray = findingPoints.findResult(testingInputArray);
        int[][] correctOutputArray = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerArrayWithoutEnoughValidPoints.txt");

        Assert.assertArrayEquals(actualArray, correctOutputArray);
    }

    @Test
    public void testArrayWithManyCoordinates() {
        int[][] testingInputArray = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingArrayWithManyCoordinates.txt");
        int[][] actualArray = findingPoints.findResult(testingInputArray);
        int[][] correctOutputArray = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerArrayWithManyCoordinates.txt");

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testArrayWithManyPointsSameCoordinates() {
        int[][] testingInputArray = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingArrayWithManyPointsSameCoordinates.txt");
        int[][] actualArray = findingPoints.findResult(testingInputArray);
        int[][] correctOutputArray = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerArrayWithManyPointsSameCoordinates.txt");

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testArrayWithNegativePoints() {
        int[][] testingInputArray = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingArrayWithNegativePoints.txt");
        int[][] actualArray = findingPoints.findResult(testingInputArray);
        int[][] correctOutputArray = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerArrayWithNegativePoints.txt");

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testArrayWithBigNumbers() {
        int[][] testingInputArray = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingArrayWithBigNumbers.txt");
        int[][] actualArray = findingPoints.findResult(testingInputArray);
        int[][] correctOutputArray = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerArrayWithBigNumbers.txt");

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }
}