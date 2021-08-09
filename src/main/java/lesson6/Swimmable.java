package lesson6;

public interface Swimmable {

    default void swim(int distance){
        System.out.println("Проплыл расстоние равное " + distance);
    }
}
