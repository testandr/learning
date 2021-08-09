package lesson2;

public class Main {
    public static void main(String[] args) {
       System.out.println(getSumStatus(15, 8));
       checkNumber(-11);
       System.out.println(getNumberStatus(-11));
       printStringInQuantity("Testing", 10);
       System.out.println(getYearStatus(400));
    }



 /**
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
  если да – вернуть true, в противном случае – false.
*/
 public static boolean getSumStatus(int numberOne, int numberTwo) {
     boolean status;
     int sum = numberOne + numberTwo;
     if (sum >= 10 && sum <= 20){
         status = true;
     }
     else{
         status = false;
     }
     return status;
 }


 /**
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
  положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
  */

 public static void checkNumber(int number){
     if (number >= 0){
         System.out.println("Введенное число " + "\"" + number + "\"" + " положительное");
     }
     else{
         System.out.println("Введенное число " + "\"" + number + "\"" + " отрицательное");
     }
 }


 /**
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
  и вернуть false если положительное.
  */
 public static boolean getNumberStatus(int number) {
     boolean status;
     if (number >= 0){
         status = false;
     }
     else{
         status = true;
     }
     return status;
 }

 public static boolean getNumberStatus2(int number) {
     return number < 0;
 }


 /**
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
  указанное количество раз;
  */
 public static void printStringInQuantity(String text, int number){
     for(int i = number; i > 0; i--) {
         System.out.println(text);
     }
 }

 /**
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
  */
 public static boolean getYearStatus(int year){
     boolean status = false;
     if (year % 4 == 0){
         if(year % 100 != 0 || year % 400 == 0){
             status = true;
         }
     }
     return status;
 }

}