package javaTestersL4;

import javaTestersL3.Apple;
import javaTestersL3.Fruit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).

         Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).

         Посчитать, сколько раз встречается каждое слово.
        **/

        ArrayList<String> newArray1 =
                new ArrayList<>(Arrays.asList("A", "A", "C", "D", "D", "F", "G", "G", "I", "I", "I", "M", "O", "P"));

        Set<String> uniqueValues = new HashSet<>(newArray1);
        String[] newArray2 = uniqueValues.toArray(new String[0]);

        for (String s : newArray2) {
            showWordFrequencyNumber(s, newArray1);
        }

        System.out.println("УНикальные значения" + uniqueValues);

        /**
         2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.

         В этот телефонный справочник с помощью метода add() можно добавлять записи,
         а с помощью метода get() искать номер телефона по фамилии.

         Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
         тогда при запросе такой фамилии должны выводиться все телефоны.
         **/
        ArrayList<String> surnameList =
                new ArrayList<>(Arrays.asList("Иванов", "Кузнецов", "Тарасов",
                        "Соколов", "Лебедев", "Петров", "Иванов", "Ершов", "Лазарев", "Иванов", "Тарасов"));

        ArrayList<Integer> phoneList =
                new ArrayList<>(Arrays.asList(796415, 156423, 896423, 563489, 956874, 815432, 953201, 148611, 954433,
                        259595, 644565));

        PhoneBook phoneBook = new PhoneBook();

        for (int i = 0; i < surnameList.size(); i++){
            phoneBook.addPerson(surnameList.get(i), phoneList.get(i));
        }

        phoneBook.showPhoneBook();
        phoneBook.getPersonNumber("Иванов");

    }

    public static void showWordFrequencyNumber(String word, ArrayList<String> list){
        System.out.println("Слово \"" + word + "\" повторияется в количестве: " +
                Collections.frequency(list, word));
    }


}