package Homework;

public class Task4_FillInDiagonal {
    public static void main(String[] args) {
        int dimension = 5;

        int[][] squareArray = new int[dimension][dimension];

        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i][i] = 1;
            squareArray[i][squareArray.length - i - 1] = 1;
        }

        Util.printArray(squareArray);
    }
}

