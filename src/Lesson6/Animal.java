package Lesson6;

public class Animal {
    String name;
    int running;
    int swimming;
    double jumping;


    public Animal(String name, int running, int swimming, double jumping) {
        this.name = name;
        this.running = running;
        this.swimming = swimming;
        this.jumping = jumping;
    }

    public Animal(String name, int running, double jumping) {
        this.name = name;
        this.running = running;
        this.jumping = jumping;
    }

    public boolean run (int distance){
        if (distance<=running){
            System.out.println(this.name + " бежит дистанцию " + distance + " метров");
            return true;
        }
        else {
            System.out.println(this.name + " не способен пробежать " + distance + " метров");
            return false;
        }
    }
    public boolean swim (int distance){
        if (distance<=swimming){
            System.out.println(this.name + " плывет дистанцию " + distance + " метров");
            return true;
        }
        else {
            System.out.println(this.name + " не способен проплыть " + distance + " метров");
            return false;
        }
    }
    public boolean jump (int height){
        if (height<=jumping){
            System.out.println(this.name + " прыгает на высоту " + height + " метров");
            return true;
        }
        else {
            System.out.println(this.name + " не способен прыгнуть на " + height + " метров");
            return false;
        }
    }
}