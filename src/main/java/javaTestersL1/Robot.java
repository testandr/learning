package javaTestersL1;

public class Robot {
    private String name;
    private int maxDistance;
    private int maxHeight;
    boolean participant;
    public Robot(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        participant = true;
    }
    public void setStatus() {
        participant = false;
    }

    public boolean getParticipantStatus() {
        return participant;
    }

    public int getDistance() {
        return maxDistance;
    }

    public int getHeight() {
        return maxHeight;
    }

    public void run(int distance, int maxDistance) {

        if(distance > maxDistance){
            System.out.println(name + " не может пробежать расстонияние равное " + distance);
            setStatus();
        }
        else {
            System.out.println(name + " пробежал расстояние равное " + distance );
        }
    }
    public void jump(int height, int maxHeight) {

        if(height > maxHeight){
            System.out.println(name + " не может перепрыгнуть высоту равную " + height);
            setStatus();;
        }
        else {
            System.out.println(name + " перепрыгнул высоту равную " + height );
        }
    }
}
