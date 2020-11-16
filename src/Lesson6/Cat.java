package Lesson6;

public class Cat extends Animal {
    public Cat(String name, int running, double jumping) {
        super(name, running, jumping);
    }
    @Override
    public boolean swim (int distance){
        System.out.println(this.name + " не умеет плавать");
        return false;
    }
}
