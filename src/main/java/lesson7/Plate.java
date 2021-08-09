package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food: " + food);
    }

   public boolean decreaseFood(int n){
        boolean status = false;
        if (food > 0 && food >= n){
            food -=n;
            status = true;
        }
        return status;
   }

    public void setFood(int newFood) {
        food += newFood;
    }
}
