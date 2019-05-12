package controller;

import java.util.Arrays;

public class Controller {
    public void process() {
        int[] array = {1, 5, 2378, 0, 47, 83, 158, 0, 146, -38, 6, 4};

        average(array);
        minIndex(array);
        zeroCount(array);
        moreThanZero(array);
        multiplyNumbers(array);
    }

    public void average(int[] array) {
        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println("Average: " + average);
    }

    public void minIndex(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Minimal element: " + min);
    }

    public void zeroCount(int[] array) {
        int count = (int) Arrays.stream(array).filter(o1 -> o1 == 0).count();
        System.out.println("Zero amount: " + count);
    }

    public void moreThanZero(int[] array) {
        int count = (int) Arrays.stream(array).filter(o1 -> o1 > 0).count();
        System.out.println("More than zero: " + count);
    }

    public void multiplyNumbers(int[] array) {
        System.out.print("Array: ");
        Arrays.stream(array).map(o1 -> o1 * 2).forEach(o1 -> System.out.print(o1 + " "));
    }
}
