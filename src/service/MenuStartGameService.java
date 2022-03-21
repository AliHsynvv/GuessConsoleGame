package service;

import util.InputUtil;

import java.util.Random;

public class MenuStartGameService {
    public static void startGame(int person){
        Random random=new Random();
        int rad= random.nextInt(person);
        int selectedPerson= InputUtil.requireNum("Who do you think is the chosen person");

        if (rad==selectedPerson){
            System.out.println("Congratulations you won!");
        }else{
            System.out.println("You failed");
            System.out.println("Selected person:"+rad);
        }
    }
}
