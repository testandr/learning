package javaTestersL3;


public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit apple2 = new Apple();
        Fruit orange2 = new Orange();
        Fruit apple3 = new Apple();

        BoxWithFruits box1 = new BoxWithFruits(apple.getWeight(), apple2.getWeight());
        BoxWithFruits box2 = new BoxWithFruits(orange.getWeight(), orange2.getWeight());

        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());

        box1.compare(box2.getBoxWeight());
    }
}
