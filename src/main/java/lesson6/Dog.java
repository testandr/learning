package lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Dog name: " + name);
    }

    @Override
    void voice() {
        System.out.println("bark");
    }

    @Override
    public void swim(int distance) {
        final int MAXSWIM = 10;
        if(distance > MAXSWIM){
            System.out.println(name + " не может проплылыть расстонияние равное " + distance);
        }
        else {
            System.out.println(name + " проплыл расстояние равное " + distance );
        }
    }

    @Override
    public void run(int distance) {
        final int MAXRUN = 500;
        if(distance > MAXRUN){
            System.out.println(name + " не может пробежать расстонияние равное " + distance);
        }
        else {
            System.out.println(name + " пробежал расстояние равное " + distance );
        }
    }
}
