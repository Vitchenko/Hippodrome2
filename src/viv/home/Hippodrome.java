package viv.home;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by viv on 12.04.2017.
 */
public class Hippodrome {

    public static  ArrayList<Horse> horses = new ArrayList<>();

    public static Hippodrome game;

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for(int i=1; i<10;i++ ){
         move();
         print();
         Thread.sleep(200);
        }
    }

    public void move(){

        for(int i=0;i<getHorses().size();i++){
            getHorses().get(i).move();
        }

    }


    public void print(){

        for(int i=0;i<getHorses().size();i++){
            getHorses().get(i).print();
        }

        System.out.println();
        System.out.println();

    }



    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome();
        Horse horse1 = new Horse("Hor1", 3, 0);
        Horse horse2 = new Horse("Hor2", 3, 0);
        Horse horse3 = new Horse("Hor3", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();

        game.printWinner();
    }


    public Horse getWinner(){

        Collections.sort(horses);
        return horses.get(horses.size()-1);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");

        for(Horse arr:horses){
            System.out.println(arr.getName() + " distance " + arr.getDistance());
        }
    }



}
