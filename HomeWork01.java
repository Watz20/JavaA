public class HomeWork01 {
    public static void main(String[] args) {
        createDataTypes();
        System.out.println("a * (b + (c / d)) = " + doCount(2, 5, 7, 8));
        System.out.println(doTestSum(5, 8));
        doDefine(-8);
        System.out.println(isNegative(-6));
        inPutName("Николай");
        doSeven(2020);
    }   //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void createDataTypes() {
        System.out.println("Задание 2.");
        byte bt = 10;
        short s = 2505;
        int i = 235654;
        long l = 7800L; // to declare long write letter L at the end
        float f = 1254.54f; // to declare float put f at the rnd
        double d = 45.87897887;
        boolean b = true;
        char c = 'F';

        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static double doCount(double a, double b, double c, double d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doTestSum(int a, int b) {
        System.out.println("\nЗадание 4.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void doDefine(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    private static boolean isNegative(int number) {
        return number < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void inPutName(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("Привет, " + name + "!");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void doSeven(int year) {
        System.out.println("\nЗадание 8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }

    //9. *Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
    //void myMethod(int a, String b) {}
    //void myMethod(String b, int a) {}
    //Это две разных сигнатуры одного метода; сигнатура метода — это имя метода 
    //плюс параметры (причем порядок параметров имеет значение).

}


