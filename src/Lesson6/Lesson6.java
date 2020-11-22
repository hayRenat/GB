package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 500, 450, 0.5);
        Dog dog1 = new Dog("Мерин", 1000, 750, 1.5);
        Cat cat = new Cat("Барсик", 450, 2);
        Cat cat1 = new Cat("Тюленьчик", 200, 1.5);

        dog.run(450);
        dog.jump(100);
        dog.swim(50);
        dog1.run(800);
    }
}
