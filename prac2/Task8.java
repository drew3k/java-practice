package prac2;

public class Task8 {
    public static void main(String[] args) {
        String[] array = {"один", "два", "три", "четыре", "пять"};

        System.out.println("Исходный массив:");
        printArray(array);

        // Переворачиваем массив
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Массив после обращения:");
        printArray(array);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
