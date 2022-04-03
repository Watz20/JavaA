package Homework;

public class Task2 {
    public static void main(String[] args) {
        int[] array8 = new int[8];

        for (int i = 0; i < array8.length; i++) {
            array8[i] = i *3;
        }
        Util.printArray(array8);
    }
}
