package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Максим", "Учредитель", "почта@почта", "89161234569", 100000, 49);
        employeesArray[1] = new Employee("Иванов Петр", "Директор", "asas@asas,ru", "891623423", 85000, 45);
        employeesArray[2] = new Employee("Максимов Иван", "Заместитель директора", "помошник@почта", "89161234569", 50000, 29);
        employeesArray[3] = new Employee("Петров Максим", "Руководитель СБ", "силовик@почта", "89161234569", 60000, 50);
        employeesArray[4] = new Employee("Людочка", "Секретарь", "кофе@почта", "89161234569", 55000, 20);
        moreThan40Years(employeesArray);
    }
    public static void moreThan40Years(Employee[] a){
    for (int i = 0; i < a.length; i++)
    {
        if (a[i].age>40)
        {
            a[i].printInfo();
            System.out.println();
        }
    }
    }
}
