package javaTestersL4;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<String> surnameList = new ArrayList<>();
    ArrayList<Integer> phoneList = new ArrayList<>();

    public PhoneBook() {
    }

    public void addPerson(String surname, int number){
        surnameList.add(surname);
        phoneList.add(number);
    }

    public void getPersonNumber(String surname){
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < surnameList.size(); i++){
            if(surname == surnameList.get(i)){
                index.add(i);
            }
        }
        System.out.println("По фамилии: " + surname + " были найдены следующий(е) номера:\n");
        for(int y = 0; y < index.size(); y++){
            System.out.println(phoneList.get(y));
        }
    }

    public void showPhoneBook(){
        for (int i = 0; i < surnameList.size(); i++){
            System.out.println("Фамилия: " + surnameList.get(i) + "\nНомер телефона: " + phoneList.get(i) + "\n **** ");
        }
    }
}
