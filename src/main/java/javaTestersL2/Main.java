package javaTestersL2;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        String[][] test2 = new String[4][4];
        test2[0][0] = "2";
        test2[0][1] = "2";
        test2[0][2] = "2";
        test2[0][3] = "2";
        test2[1][0] = "2";
        test2[1][1] = "2";
        test2[1][2] = "2";
        test2[1][3] = "2";
        test2[2][0] = "2";
        test2[2][1] = "ф";
        test2[2][2] = "2";
        test2[2][3] = "2";
        test2[3][0] = "2";
        test2[3][1] = "2";
        test2[3][2] = "2";
        test2[3][3] = "2";

        String[][] test3 = new String[5][5];
        test3[0][0] = "2";
        test3[0][1] = "2";
        test3[0][2] = "2";
        test3[0][3] = "2";
        test3[0][4] = "2";
        test3[1][0] = "2";
        test3[1][1] = "2";
        test3[1][2] = "2";
        test3[1][3] = "2";
        test3[1][4] = "2";
        test3[2][0] = "2";
        test3[2][1] = "ф";
        test3[2][2] = "2";
        test3[2][3] = "2";
        test3[2][4] = "2";
        test3[3][0] = "2";
        test3[3][1] = "2";
        test3[3][2] = "2";
        test3[3][3] = "2";
        test3[3][4] = "2";
        test3[4][0] = "2";
        test3[4][1] = "2";
        test3[4][2] = "2";
        test3[4][3] = "2";
        test3[4][4] = "2";

        sum = arrayElementSum(test3);
        System.out.println(sum);
    }

    public static int arrayElementSum(String test[][]){
        int sum = 0;
        int number = 0;
        if (test.length > 4) {
            throw new ArrayIndexOutOfBoundsException("Размер массива больше чем должен быть");
        }
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                try {
                    number = Integer.parseInt(test[i][j]);
                    sum += number;
                }
                catch (Exception e){
                    System.out.println("В строке символ а не число у элемента ["+i+"]"+"["+j+"]");
                }
            }
        }
        return sum;
    }
}
