//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class main {
    public static void main(String[] args){
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5.1f;
        double f = 5.2;
        char g = 0;
        boolean h = true;
//        System.out.println(formula(5, 7, 10, 3));
//        System.out.println(summ(15, 6));
//        positive(10);
//        System.out.println(negative(-4));
//        hello("Петя");
//        bissextile(104);


    }
    public static float formula (float a, float b, float c, float d){
        return (a * (b + (c / d)));
    }
    public static boolean summ (int a, int b){
        if (a+b>=10&&a+b<=20)
            return true;
        else return false;
    }
    public static void positive(int a){
        if (a>=0)
            System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }
    public static boolean negative (int a){
        if (a<0)
            return true;
        else return false;
    }
    public static void hello (String a){
        System.out.println("Привет, "+a+"!");
    }
    public static void bissextile (int a){
        if (a%4==0&&a%100!=0||a%400==0)
            System.out.println("Високосный год");
        else
            System.out.println("Не вискокосный год");
    }
//    public static void bissextile (int a)
//    {System.out.println(a%4==0&&a%100!=0||a%400==0 ? "Високосный год" : "Не вискокосный год");}
}



