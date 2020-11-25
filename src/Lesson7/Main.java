package Lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Борис Бритва", random.nextInt(10));
        cats[1] = new Cat("Хлоя Мерец", random.nextInt(10));
        cats[2] = new Cat("Эркюль", random.nextInt(10));
        Plate plate = new Plate(random.nextInt(20));
        System.out.println("В тарелке - " + plate.getFood() + " еды");
        for (int i = 0; i<cats.length; i++){
            cats[i].getAppetite();
            cats[i].eat(plate);
            cats[i].infoSatiety();
        }
    }
}

