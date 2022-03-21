package util;

import bean.Person;
import bean.Config;

public class PersonUtil {
    public static Person fillPerson() throws Exception {
        String name = requireTextname();
        String surname = requireTextsurname();
        int age = requireTextage();
        Person st = new Person(name, surname, age);
        FileUtility.WriteObjectToFile(st,"Person.obj");
        return st;
    }

    public static void showAllPerson() {
        if (Config.persons == null) {
            return;
        }
        for (int i = 0; i < Config.persons.length; i++) {
            Person st = Config.persons[i];
            System.out.println((i + 1) + "." + st.getfullinfo());
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static String requireTextname() {
        return InputUtil.requireText("Name");
    }

    public static String requireTextsurname() {
        return InputUtil.requireText("Surname");
    }

    public static int requireTextage() {
        return InputUtil.requireNum("Age");
    }

}
