package javaTestersL3;

public class Orange extends Fruit{
    double weight;

    public Orange() {
        weight = 1.5;
    }

    @Override
    public double getWeight() { return weight; }
}
