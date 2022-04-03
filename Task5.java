package Homework;

public class Task5 {
    public static void main(String[] args) {
        int[] arrayForSearch = {1, 5, 2, 3, 11, 4, 5, 2, 4, 8, 9, 1};

        findMinMax(arrayForSearch);
    }

    private static void findMinMax(int[] search) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < search.length; i++) {
            if (i == 0) {
                max = search[i];
                min = search[i];
            } else {
                max = (search[i] > max) ? search[i] : max;
                min = (search[i] < min) ? search[i] : min;
            }
        }

        System.out.println("Минимальный: " + min);
        System.out.println("Максимальный: " + max);
    }
}
