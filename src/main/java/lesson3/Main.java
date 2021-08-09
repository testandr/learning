package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] numbers2 = new int[100];
        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] numbers4 = new int[5][5];
        int[] numbers5 = {1, 2, 3, 6, 6, 6};

        changeZeroToOne(numbers);
        fillInArray(numbers2);
        increaseValueIfSmaller(numbers3, 6);
        changeDiagonalValueTo(numbers4, 1);
        System.out.println(Arrays.toString(getArrayWithLengthAndValue(10, 3)));
        minMaxElementInArray(numbers3);
        System.out.println(checkIfSumEqualPossible(numbers5));
        moveElementsBySteps(numbers3, -2);
    }
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void changeZeroToOne(int[] numbers){
        System.out.println("\n*** Задание 1 *** \n");
        System.out.println("Массив до изменений    " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0){
                numbers[i] = 1;
            }
            else {
                numbers[i] = 0;
            }
        }
        System.out.println("Массив после изменений " + Arrays.toString(numbers));
    }

     /**
     * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
     public static void fillInArray(int[] numbers){
         System.out.println("\n*** Задание 2 *** \n");
         System.out.println("Массив до заполенния    " + Arrays.toString(numbers));
         for (int i = 0; i < numbers.length; i++){
                 numbers[i] = i + 1;
         }
         System.out.println("Массив после заполенния " + Arrays.toString(numbers));
     }

     /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
     public static void increaseValueIfSmaller(int[] numbers, int restriction){
         System.out.println("\n*** Задание 3 *** \n");
         System.out.println("Массив до изменений    " + Arrays.toString(numbers));
         for (int i = 0; i < numbers.length; i++){
             if (numbers[i] < restriction){
                 numbers[i] = numbers[i] * 2;
             }
         }
         System.out.println("Массив после изменений " + Arrays.toString(numbers));
     }

     /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
      * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
      * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
      * элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
     public static void changeDiagonalValueTo(int[][] numbers, int value){
         System.out.println("\n*** Задание 4 *** \n");
         System.out.println("Двумерный массив до изменений");
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                 System.out.print(numbers[i][j]);
             }
             System.out.println();
         }

         for(int i = 0; i < numbers.length; i++){
             for (int j = 0; j < numbers[i].length; j++) {
                 if (i == j) {
                     numbers[i][j] = value;
                 }
                 else if (i+j == numbers.length - 1){
                     numbers[i][j] = value;
                 }
             }
         }

         System.out.println("Двумерный массив после изменений");
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                 System.out.print(numbers[i][j]);
             }
             System.out.println();
         }
     }


     /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
      * одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
     public static int[] getArrayWithLengthAndValue(int length, int initialValue){
         System.out.println("\n*** Задание 5 *** \n");
         int [] numbers = new int[length];
         for(int i = 0; i < length; i++){
             numbers[i] = initialValue;
         }
         return numbers;
     }

     /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
     public static void minMaxElementInArray(int[] numbers){
         System.out.println("\n*** Задание 6 *** \n");
         int maxValue = numbers[0];
         int minValue = numbers[0];

         for(int i = 1; i < numbers.length; i++){
             if(numbers[i] > maxValue){
                 maxValue = numbers[i];
             }
         }
         System.out.println("Максимальное значение " + maxValue);

         for(int i = 1; i<numbers.length; i++){
             if(numbers[i] < minValue){
                 minValue = numbers[i];
             }
         }
         System.out.println("Минимальное значение " + minValue);
     }


     /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод
      * должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * **Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */
     public static boolean checkIfSumEqualPossible(int[] numbers){
         System.out.println("\n*** Задание 7 *** \n");
         boolean x = false;
         int sumLeft = 0;
         int sumRight = 0;

         for (int i = 0; i < numbers.length; i++) {
             for (int y = i + 1; y < numbers.length; y++) {
                 sumRight = sumRight + numbers[y];
             }
             sumLeft = sumLeft + numbers[i];
             if (sumLeft == sumRight) {
                 x = true;
                 System.out.println("Сумма из " + (i+1) + " значения/й в начале массива равна сумме оставшихся значений в массиве");
             }
             sumRight = 0;
         }
         return x;
     }


     /**
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
      * или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
      * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
      * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
      * При каком n в какую сторону сдвиг можете выбирать сами.
     */
     public static void moveElementsBySteps(int[] numbers, int step){
         System.out.println("\n*** Задание 8 *** \n");
         System.out.println("Массив до изменений    " + Arrays.toString(numbers));
         if (step > 0){
             for (int y = 0; y < step; y++){
                 int lastNumber = numbers[numbers.length-1];
                 for (int i = numbers.length-1; i > 0; i--){
                     numbers[i] = numbers[i-1];
                 }
                 numbers[0] = lastNumber;
             }
             System.out.println("Массив после изменений " + Arrays.toString(numbers));
         }
         else if (step == 0){
             System.out.println("Так как шаг " + step + "массив остается без изменений    " + Arrays.toString(numbers));
         }
         else {
             for (int y = 0; y < Math.abs(step); y++){
                 int firstNumber = numbers[0];
                 for (int i = 0; i < numbers.length; i++){
                     if (i != numbers.length-1) {
                         numbers[i] = numbers[i + 1];
                     }
                 }
                 numbers[numbers.length-1] = firstNumber;
             }
             System.out.println("Массив после изменений " + Arrays.toString(numbers));
         }
     }
}
