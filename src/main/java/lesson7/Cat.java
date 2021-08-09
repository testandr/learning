package lesson7;

public class Cat {
    private String name;
    private int appetite;
    boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void setFullness() {
        fullness = true;
    }

    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)){
            setFullness();
        }
    }

    public void info(){
        System.out.println("name: " + name + "; fullness: " + fullness);
    }

}
