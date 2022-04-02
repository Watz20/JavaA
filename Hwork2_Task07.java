public class Hwork2_Task07 {
    public static void main(String[] args) {

        //Задание №7
        int[] intArrTest;
        System.out.println("Задание №7  реализация метода осуществляющего смещение элементов массива на заданное число позиций ");
        System.out.println("            количество позиций смещения - число (может быть положительным или отрицательным)");
        System.out.println("            Попытка №1 смещение влево (передаваемый параметр n=2)");
        intArrTest = getArithmeticProgression(10, 1, 0); // создаю массив арифм. последовательности с шагом 1
        printArrLine(intArrTest);                                           // вывожу оригинальный массив
        printArrLine(getArrayWithShift(intArrTest, 2));                 // вывожу результирующий массив (смещенный)
        System.out.println("            !!! все работает массив сместился вправо на 2 элемента");
        System.out.println("            Попытка №2 смещение влево (передаваемый параметр n=-3)");
        intArrTest = getArithmeticProgression(10, 1, 0); // создаю массив арифм. последовательности с шагом 1 заново
        printArrLine(intArrTest);
        printArrLine(getArrayWithShift(intArrTest, -3));                 // вывожу результирующий массив (смещенный)
        System.out.println("            !!! все работает массив сместился влево на 3 элемента");
        System.out.println("            *** Массив обработан методом getArrayWithShift() - все работает задача выполнена.");
        System.out.println();
    }

    // Дополнительный метод - выводит элементы массива тип int в форматированную строку (для удобства )
    public static void printArrLine(int[] a) {
        for (int elem : a) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }

    public static int[] getArithmeticProgression(int length, int increment, int firstElem) {
        int[] arr;
        arr = new int[length];
        arr[0] = firstElem;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + increment;
        }
        return arr;
    }

    /* Задание №7 метод реализующий смещение элементов массива влево или вправо циклически
    / без использования дополнительных пакетов и временных массивов
    / смещение осуществляется при shift > 0 вправо при shift < 0 влево */
    public static int[] getArrayWithShift(int[] arr, int shift) {
        if (shift > 0) {
            for (int s = 1; s <= shift; s++) {
                int elemshift = arr[arr.length - 1];
                System.arraycopy(arr, 0, arr, 1, arr.length - 2 + 1);
                arr[0] = elemshift;
            }
        } else if (shift < 0) {
            for (int s = shift; s <= -1; s++) {
                int elemshift = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = elemshift;
            }
        }
        return arr;
    }
}

