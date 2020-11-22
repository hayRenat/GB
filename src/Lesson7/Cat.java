package Lesson7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (satiety!=true) {
            if (appetite > p.getFood()) {
                System.out.println("Для " + name + " слишком мало еды");
            }
            if (appetite <= p.getFood()) {
                p.decreaseFood(appetite);
                System.out.println(name + " съел из тарелки " + appetite + " еды");
                satiety = true;
            }
        }
    }
    public void infoSatiety(){
        if (satiety==true)
            System.out.println(name + " сыт");
        else System.out.println(name + " голоден");
    }
    public void getAppetite(){
        System.out.println(name + " голоден на " + appetite);
    }
}

