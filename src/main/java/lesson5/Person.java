package lesson5;

public class Person {

    public String name;
    public String position;
    public String email;
    public int number;
    public int age;

    public Person(String name, String position, String email, int number, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя пользователя: " + name + "; " + "Должность: " + position + "; " + "Эмайл: " + email + "; " + "Номер телефона: " + number + "; " + "Возраст: " + age);
    }

}
