package org.example;

import Heroes.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sniper archer = new Sniper("Ваня");
        ArrayList<BaseHero> red = new ArrayList<>();
        ArrayList<BaseHero> white = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int team = new Random().nextInt(0,2);
            switch (new Random().nextInt(0,7)){
                case 0:
                    if(team == 0){
                        red.add(new XBowMan(getName()));
                    }else{
                        white.add(new XBowMan(getName()));
                    }
                    break;
                case 1:
                    if(team == 0){
                        red.add(new Sniper(getName()));
                    }else{
                        white.add(new Sniper(getName()));
                    }
                    break;
                case 2:
                    if(team == 0){
                        red.add(new Peasant(getName()));
                    }else{
                        white.add(new Peasant(getName()));
                    }
                    break;
                case 3:
                    if(team == 0){
                        red.add(new Bandit(getName()));
                    }else{
                        white.add(new Bandit(getName()));
                    }
                    break;
                case 4:
                    if(team == 0){
                        red.add(new Monk(getName()));
                    }else{
                        white.add(new Monk(getName()));
                    }
                    break;
                case 5:
                    if(team == 0){
                        red.add(new Warlock(getName()));
                    }else {
                        white.add(new Warlock(getName()));
                    }
                    break;
                case 6:
                    if(team == 0){
                        red.add(new Spearman(getName()));
                    }else {
                        white.add(new Spearman(getName()));
                    }
                    break;
            }
        }
        System.out.println("Red");
        red.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o1.getHealth() - o2.getHealth();
            }
        });
        red.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("White");
        white.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o1.getHealth() - o2.getHealth();
            }
        });
        white.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}