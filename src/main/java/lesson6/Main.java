package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal dog = new Dog("Sharik");

        cat.run(1000);
        cat.swim(100);
        dog.run(200);
        dog.swim(10);
    }
}
