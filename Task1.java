package Homework;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayOfBytes = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrayOfBytes.length; i++) {
            arrayOfBytes[i] = (arrayOfBytes[i] == 1) ? 0 : 1;
        }
        Util.printArray(arrayOfBytes);
    }
}

