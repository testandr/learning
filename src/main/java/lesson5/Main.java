package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30);
        persArray[1] = new Person("Ivanov1 Ivan1", "Engineer1", "ivivan1@mailbox.com", 892312312, 40);
        persArray[2] = new Person("Ivanov2 Ivan2", "Engineer2", "ivivan2@mailbox.com", 892312312, 41);
        persArray[3] = new Person("Ivanov3 Ivan3", "Engineer3", "ivivan3@mailbox.com", 892312312, 54);
        persArray[4] = new Person("Ivanov4 Ivan4", "Engineer4", "ivivan4@mailbox.com", 892312312, 70);

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > 40){
                persArray[i].info();
            }
        }
    }
}
