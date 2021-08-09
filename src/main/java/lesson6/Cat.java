package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Cat name: " + name);
    }

    @Override
    void voice() {
        System.out.println("meow");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не умеют плавать");
    }

    @Override
    public void run(int distance) {
        final int MAXRUN = 200;
        if(distance > MAXRUN){
            System.out.println(name + " не может пробежать расстонияние равное " + distance);
        }
        else {
            System.out.println(name + " пробежал расстояние равное " + distance );
        }
    }
}
