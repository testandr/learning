package javaTestersL5;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = new int[2][3];

        data[0][0] = 100;
        data[0][1] = 200;
        data[0][2] = 123;
        data[1][0] = 300;
        data[1][1] = 400;
        data[1][2] = 500;

        AppData someDataOut = new AppData(header, data);
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("demo.txt"))) {
            objOut.writeObject(someDataOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        AppData someDataIn = null;
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("demo.txt"))) {
            someDataIn = (AppData) objIn.readObject();
            someDataIn.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}






