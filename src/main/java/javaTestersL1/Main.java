package javaTestersL1;

import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        int obstacleСourse[] = {50, 10, 5, 200, 10, 30, 221, 451, 7850, 80};
        Human[] humanArray = new Human[5];
        Cat[] catArray = new Cat[5];
        Robot[] robotArray = new Robot[5];


        humanArray[0] = new Human("human1", 100, 10);
        humanArray[1] = new Human("human2", 200, 1);
        humanArray[2] = new Human("human3", 50, 3);
        humanArray[3] = new Human("human4", 400, 5);
        humanArray[4] = new Human("human5", 10, 7);

        catArray[0] = new Cat("cat1", 200, 20);
        catArray[1] = new Cat("cat2", 100, 15);
        catArray[2] = new Cat("cat3", 350, 10);
        catArray[3] = new Cat("cat4", 500, 14);
        catArray[4] = new Cat("cat5", 700, 25);

        robotArray[0] = new Robot("robot1", 1000, 20);
        robotArray[1] = new Robot("robot2", 1500, 10);
        robotArray[2] = new Robot("robot3", 2000, 25);
        robotArray[3] = new Robot("robot4", 2500, 30);
        robotArray[4] = new Robot("robot5", 3000, 22);



        for (int i = 0; i < obstacleСourse.length; i++){
            if (i%2 == 0){
                for (int y = 0; y < humanArray.length; y++){
                    if(humanArray[y].getParticipantStatus() == true) {
                        humanArray[y].jump(obstacleСourse[i], humanArray[y].getHeight());
                    }
                    else{
                        humanArray = ArrayUtils.removeElement(humanArray, y);
                    }
                }
                for (int u = 0; u < catArray.length; u++){
                    if (catArray[u].getParticipantStatus() == true){
                        catArray[u].jump(obstacleСourse[i], catArray[u].getHeight());
                    }
                    else{
                        catArray = ArrayUtils.removeElement(catArray, u);
                    }
                }
                for (int o = 0; o < robotArray.length; o++){
                    if (robotArray[o].getParticipantStatus() == true){
                        robotArray[o].jump(obstacleСourse[i], robotArray[o].getHeight());
                    }
                    else{
                        robotArray = ArrayUtils.removeElement(robotArray, o);
                    }
                    }
                }
            else {
                for (int y = 0; y < humanArray.length; y++){
                    if(humanArray[y].getParticipantStatus() == true) {
                        humanArray[y].run(obstacleСourse[i], humanArray[y].getDistance());
                    }
                    else{
                        humanArray = ArrayUtils.removeElement(humanArray, y);
                    }
            }
                for (int u = 0; u < catArray.length; u++){
                    if (catArray[u].getParticipantStatus() == true){
                        catArray[u].run(obstacleСourse[i], catArray[u].getDistance());
                    }
                    else{
                        catArray = ArrayUtils.removeElement(catArray, u);
                    }
                }
                for (int o = 0; o < robotArray.length; o++){
                    if (robotArray[o].getParticipantStatus() == true){
                        robotArray[o].run(obstacleСourse[i], robotArray[o].getDistance());
                    }
                    else{
                        robotArray = ArrayUtils.removeElement(robotArray, o);
                    }
                }
            }
        }


    }
}
