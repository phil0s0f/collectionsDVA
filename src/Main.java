import java.util.*;

public class Main {
    //TODO Задача 1. Сгенерируйте массив целых чисел, используя класс Random(). Используя методы классов-коллекций определите уникальные числа (вариант 2)
    //TODO Задача 9. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные - в начало этого списка  (вариант 18).
    static List<Integer> addRandom(List<Integer> array, int N) {
        Random generator = new Random();
        for (int i = 0; i < N; i++) {
            array.add(new Integer(generator.nextInt()));
        }
        return array;
    }
    static void outArray(List<Integer> array, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
    static List<Integer> addArray(List<Integer> array, int N) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            array.add(input.nextInt());
        }
        return array;
    }
    static void searchUnique(List<Integer> array, int N) {
        HashSet uniqueArray = new HashSet();
        for (int i = 0; i < N; i++) {
            uniqueArray.add(array.get(i));
        }
        Iterator iterator = uniqueArray.iterator();
        System.out.println("Уникальные значения массива:");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int N = input.nextInt();
        //array = addRandom(array,N);
        array = addArray(array,N);
        outArray(array, N);
        //array.sort();
    }
}