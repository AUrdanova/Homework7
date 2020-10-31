package com.company;

public class Main {



    public static void main(String[] args) {
        Hero superHero = new Hero() {
            @Override
            public void applySuperAbility() {
                System.out.println("Hero применил свою суперспособность");
            }


        };
        Magic magic = new Magic();
        magic.applySuperAbility();

        HavingSuperAbility[] team = {superHero, magic, new Medic(), new Warrior()};
        for (int i = 0; i < team.length; i++) {
            team[i].applySuperAbility();
            
        }


    }

}
