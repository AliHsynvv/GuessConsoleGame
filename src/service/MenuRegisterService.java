package service;

import bean.Person;
import bean.Config;
import util.PersonUtil;

public class MenuRegisterService {
    public static void Register(int person) throws Exception {
        Config.persons = new Person[person];
        for (int i = 0; i < person; i++) {
            System.out.println((i + 1) + ".Registration");
            Config.persons[i] = PersonUtil.fillPerson();
        }
        System.out.println("The participants of the competition were successfully registered.");
        System.out.println("Select the next operation --- ");
        return;
    }
}
