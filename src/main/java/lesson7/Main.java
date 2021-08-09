package lesson7;

public class Main {
    public static void main(String[] args){
        Cat[] cat = {
                new Cat("Barsik", 10),
                new Cat("Myrzik", 15),
                new Cat("Feliks", 6),
                new Cat("Matroskin", 25),
                new Cat("Saimon", 40),
                new Cat("Leopold", 10),
                new Cat("Tom", 31),

        };
        Plate plate = new Plate(100);

        for (int i = 0; i < cat.length; i++){
            cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
        plate.setFood(10);
        plate.info();
    }
}
