package Homework;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (arrayOfNumbers[i] < 6) ? (arrayOfNumbers[i] * 2) : arrayOfNumbers[i];
        }
        Util.printArray(arrayOfNumbers);
    }
}
