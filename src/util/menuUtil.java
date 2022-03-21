package util;

import service.MenuRegisterService;
import service.MenuStartGameService;

public class menuUtil {

    public static void showAdminMenu() {
        int banLimit = 0;
        while (banLimit < 3) {
            banLimit++;
            try {
                System.out.println("--Admin Login System--");
                String username = util.InputUtil.requireText("Username");
                int password = util.InputUtil.requireNum("Password");
                if (username.equals("Aliakbar") && password == 123) {
                    System.out.println("Successfuly login");
                    return;
                } else {
                    System.out.println("Invalid Login");
                }
            } catch (Exception ex) {
                System.err.println("You can only enter the number!");
            }
        }

        System.out.println("You banned");
        System.exit(0);
    }

    public static void showMenu() throws Exception {
        int person=0;
        System.out.println("1.Register" +
                "\n" + "2.Start game" +
                "\n" + "3.Logout" +
                "\n" + "4.Exit" +
                "\n" + "5.Show all person");
        int num = util.InputUtil.requireNum("Choose");
        if (num == 1) {
            person = util.InputUtil.requireNum("How many people will take part in the competition");
            MenuRegisterService.Register(person);
            showMenu();
        } else if (num == 2) {
            MenuStartGameService.startGame(person);
        } else if (num == 3) {
            showAdminMenu();
        } else if (num == 4) {
            System.exit(0);
        } else if (num == 5) {
            util.PersonUtil.showAllPerson();
        }

    }
}
