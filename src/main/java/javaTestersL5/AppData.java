package javaTestersL5;

import java.io.Serializable;
import java.util.Arrays;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void info() {
        System.out.println(String.join("; ", header));
        System.out.println(Arrays.deepToString(data));
    }

}
