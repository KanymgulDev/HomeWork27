public class Main {
    public static <T> void printArray(T[] array) {


        System.out.println(array[0]);

        System.out.println("акыркы элемент : " + array[array.length - 1]);
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"apple", "banana", "lemon", "mango"};
        printArray(intArray);
        printArray(stringArray);
    }
}