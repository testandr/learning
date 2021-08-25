package javaTestersL3;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class BoxWithFruits<T extends Number> {
    private T[] fruits;

    public BoxWithFruits(T... fruits){
        this.fruits = fruits;
    }

    public T[] getObj() {
        return fruits;
    }

    public void setObj(T[] fruits) {
        this.fruits = fruits;
    }

    public double getBoxWeight() {
        double sum = 0.0;
        for (int i = 0; i < fruits.length; i++){
            sum = sum + fruits[i].doubleValue();
        }
        return sum;
    }

    public void compare(double boxTwoWeight){
        double weight = 0.0;
        double difference = 0.0;
        weight = getBoxWeight();
        if(weight > boxTwoWeight){
            difference = weight - boxTwoWeight;
            System.out.println("Коробка номер один тяжелее на " + difference);
        }
        else if(weight < boxTwoWeight){
            difference = boxTwoWeight - weight;
            System.out.println("Коробка номер два тяжелее на " + difference);
        }
        else{
            System.out.println("Коробк равны по весу");
        }
    }

    public void clearBox(){
        for (int i = 0; i < fruits.length; i++){
            fruits = ArrayUtils.removeElement(fruits, i);
        }
        System.out.println(fruits.length);
    }

    public void addFruitToBox(T fruit){

    }
}
