package org.example;

import Heroes.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sniper archer = new Sniper("Ваня");
        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(new XBowMan(getName()));
        list.add(new Sniper(getName()));
        list.add(new Peasant(getName()));
        list.add(new Bandit(getName()));
        list.add(new Monk(getName()));
        list.add(new Warlock(getName()));
        list.add(new Spearman(getName()));
        list.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}