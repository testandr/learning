package lesson1;


import java.beans.JavaBean;
import java.lang.reflect.Array;

/**
 * JavaDoc comment
 */

public class Main {
    public static void main(String[] args) {
       for(int i = 10; i > 0; i++){}
    }

/**
 * Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 */
    public static void printThreeWords() {
        String word1 = "Orange";
        String word2 = "Banana";
        String word3 = "Apple";

        System.out.println(word1 + "\n" + word2 + "\n" + word3);
        // Другой способ вывести данные
        // System.out.println(word1);
        // System.out.println(word2);
        // System.out.println(word3);
    }

    /**
     * Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
     * и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
     * в противном случае - “Сумма отрицательная”;
     */
    public static void checkSumSign() {
       int a = -12;
       int b = -100;
       int c = a + b;
       if (c >= 0){
           System.out.println("Сумма положительная");
       }
       else{
           System.out.println("Сумма отрицательная");
       }
    }

    /**
     * Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     * если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value <= 100){
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    /**
     * Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */
    public static void compareNumbers() {
        int a = -120;
        int b = -100;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}