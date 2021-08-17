package javaTestersL3;

public class Apple extends Fruit{
    double weight;

    public Apple() {
        weight = 1.0;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
