package handler;

import entity.Monster;

import java.util.ArrayList;
import java.util.Random;

public class Battle {

    Random ran = new Random();

    static ArrayList<Monster> monster = null;

    Monster randomMonster = null;

    String monsterName = null;
    int monsterHp = 0;
    int monsterDam = 0;
    int monsterDrop = 0;

    int myHp = 0;
    int myDam = 0;

    //1 == player 2 == monster
    int turn = 1;

    boolean fight = false;

    public Battle(ArrayList<Monster> monster){
        this.monster = monster;
    }

    public void viewBattle(){
        fight = true;
        getRandomMonster();
        monsterName = randomMonster.getName();
        monsterHp = randomMonster.getHp();
        monsterDam = randomMonster.getDamage();
        monsterDrop = randomMonster.getDrop();

        myHp = Town.player.getHp();
        myDam = Town.player.getDamage();

        System.out.println("Wild" + monsterName + " appeared!");
        while(fight){
            System.out.println(monsterName);
            System.out.println(randomMonster.getMAX_HP() + " / " + monsterHp);
            System.out.println("========================================================");
            System.out.println("You");
            System.out.println(Town.player.getMAX_HP() + " / " + myHp);
            System.out.println("What would you like to do?");
            System.out.println("[1] Fight");
            System.out.println("[2] Bag");
            System.out.println("[0]Run");
            int choice = Start.input.NumInput();
            if(choice == 0){
                break;
            }else if(choice == 1){
                initFight();
            }else if(choice == 2){

            }
        }
    }

    public void getRandomMonster(){
        randomMonster = monster.get(ran.nextInt(monster.size()));
    }

    public void initFight(){
        if(turn == 1){
            System.out.println("You take a swing" + " -" + myDam);
            monsterHp -= myDam;
            if(monsterHp <= 0){
                initVictory();
            }else {
                turn = 2;
            }
        }

        if(turn == 2){
            System.out.println("The monster takes a swing at you");
            int chance = ran.nextInt(3);
            if(chance == 0){
                System.out.println("The monster missed and hit -0");
            }else{
                int randomDamage = ran.nextInt(monsterDam) + 1;
                System.out.println("The monster hits you with -" + randomDamage);
                myHp -= randomDamage;
            }
            if(myHp <= 0){
                System.exit(0);
            }else{
                turn = 1;
            }
        }
    }

    public void initVictory(){
        int drop = ran.nextInt(monsterDrop) + 1;
        System.out.println("You defeated the " + monsterName);
        System.out.println("You found +" + drop + " gold coins");
        Town.player.setGp(Town.player.getGp() + drop);
        Town.player.setHp(myHp);
        fight = false;
    }
}
