package Lesson5;

public class Employee {
    String FIO;
    String position;
    String email;
    String telephone;
    int salary;
    int age;

    public Employee(String FIO,String position, String email, String telephone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Фамилия Имя Отчество - " + FIO);
        System.out.println("Должность - " + position);
        System.out.println("Электронная почта - " + email);
        System.out.println("Номер телефона - " + telephone);
        System.out.println("Заработная плата - " + salary);
        System.out.println("Возраст - " + age);
    }
}
