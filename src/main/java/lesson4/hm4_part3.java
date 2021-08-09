package lesson4;

import java.util.Random;
import java.util.Scanner;

public class hm4_part3 {

    public static int SIZE = 5;
    public static char[] arr4 = new char[4];
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static char[][] arrLeftUp = new char[4][4];
    public static char[][] arrRightUp = new char[4][4];
    public static char[][] arrLeftDown = new char[4][4];
    public static char[][] arrRightDown = new char[4][4];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWinSize4(map, arrLeftUp, arrRightUp, arrLeftDown, arrRightDown, arr4, DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWinSize4(map, arrLeftUp, arrRightUp, arrLeftDown, arrRightDown, arr4, DOT_X)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра закончена");
    }



    public static boolean checkWinSize4(char[][] main, char[][] arrLeftUp, char[][] arrRightUp, char[][] arrLeftDown, char[][] arrRightDown, char[] clean, char symb) {
        boolean x = false;
        getArrLeftUp(main, arrLeftUp);
        getArrRightUp(main, arrRightUp);
        getArrLeftDown(main, arrLeftDown);
        getArrRightDown(main, arrRightDown);

        if (checkRowIfWin(arrLeftUp, clean, symb) == true || checkDiagonalRightIfWin(arrLeftUp, clean, symb) == true || checkDiagonalLeftIfWin(arrLeftUp, clean, symb) == true || checkColumnIfWin(arrLeftUp, clean, symb) == true){
            x = true;
        }
        else if (checkRowIfWin(arrRightUp, clean, symb) == true || checkDiagonalRightIfWin(arrRightUp, clean, symb) == true || checkDiagonalLeftIfWin(arrRightUp, clean, symb) == true || checkColumnIfWin(arrRightUp, clean, symb) == true){
            x = true;
        }
        else if (checkRowIfWin(arrLeftDown, clean, symb) == true || checkDiagonalRightIfWin(arrLeftDown, clean, symb) == true || checkDiagonalLeftIfWin(arrLeftDown, clean, symb) == true || checkColumnIfWin(arrLeftDown, clean, symb) == true){
            x = true;
        }
        else if (checkRowIfWin(arrRightDown, clean, symb) == true || checkDiagonalRightIfWin(arrRightDown, clean, symb) == true || checkDiagonalLeftIfWin(arrRightDown, clean, symb) == true || checkColumnIfWin(arrRightDown, clean, symb) == true){
            x = true;
        }

        return x;
    }

    public static void getArrLeftUp(char[][] main, char[][] arrLeftUp) {
        for (int i = 0; i < main.length-1; i++){
            for(int j = 0; j < main[i].length-1; j++){
                arrLeftUp[i][j] = main[i][j];
            }
        }
    }

    public static void getArrRightUp(char[][] main, char[][] arrRightUp) {
        for (int i = 0; i < main.length-1; i++){
            for(int j = 1; j < main[i].length; j++){
                arrRightUp[i][j-1] = main[i][j];
            }
        }
    }

    public static void getArrLeftDown(char[][] main, char[][] arrLeftDown) {
        for (int i = 1; i < main.length; i++){
            for(int j = 0; j < main[i].length-1; j++){
                arrLeftDown[i-1][j] = main[i][j];
            }
        }
    }

    public static void getArrRightDown(char[][] main, char[][] arrRightDown) {
        for (int i = 1; i < main.length; i++){
            for(int j = 1; j < main[i].length; j++){
                arrRightDown[i-1][j-1] = main[i][j];
            }
        }
    }

    public static boolean checkRowIfWin(char[][] arr, char[] arr2, char symb) {
        boolean x = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j] = arr[i][j];
                if (j == arr[i].length - 1) {
                    if (arr2[0] == symb && arr2[1] == symb && arr2[2] == symb && arr2[3] == symb) {
                        x = true;
                    }
                }
            }
        }
        cleanArr(arr2);
        return x;
    }

    public static boolean checkColumnIfWin(char[][] arr, char[] arr2, char symb) {
        boolean x = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j] = arr[j][i];
                if (j == arr[i].length - 1) {
                    if (arr2[0] == symb && arr2[1] == symb && arr2[2] == symb && arr2[3] == symb) {
                        x = true;
                    }
                }
            }
        }

        cleanArr(arr2);
        return x;
    }

    public static boolean checkDiagonalRightIfWin(char[][] arr, char[] arr2, char symb) {
        boolean x = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr2[j] = arr[i][j];
                }
                if (j == arr[i].length - 1) {
                    if (arr2[0] == symb && arr2[1] == symb && arr2[2] == symb && arr2[3] == symb) {
                        x = true;
                    }
                }
            }
        }
        cleanArr(arr2);
        return x;
    }

    public static boolean checkDiagonalLeftIfWin(char[][] arr, char[] arr2, char symb) {
        boolean x = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i+j == arr.length - 1)) {
                    arr2[j] = arr[i][j];
                }
                if(j == arr[i].length-1){
                    if (arr2[0] == symb && arr2[1] == symb && arr2[2] == symb && arr2[3] == symb){
                        x = true;
                    }
                }
            }
        }
        cleanArr(arr2);
        return x;
    }

    public static void cleanArr(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = '*';
        }
    }



    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }



    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }



    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }



    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }



    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }



    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
