package Lesson2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(replacing0with1(arr)));

//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr8 = new int[8];
//        System.out.println(Arrays.toString(arrayIsLargerBy3(arr8)));

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(iflessthan6then2(arr12)));

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arrsquare = new int[10][10];
//        System.out.println(Arrays.deepToString(diagonally(arrsquare)));

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] array5 = {50, 60, 85, 48, 85, 65, 12, 14};
//        arrayminmax(array5);

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
// части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] arr6 = {5, 5, 0, 1, 8, 1};
//        System.out.println((checkBalance(arr6)));

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы  массива
// на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftToN(arr7, -1);
        System.out.println(Arrays.toString(arr7));

    }

    public static int[] replacing0with1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                a[i] = 1;
            else a[i] = 0;
        }
        return a;
    }

    public static int[] arrayIsLargerBy3(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = x;
            x += 3;
        }
        return a;
    }

    public static int[] iflessthan6then2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6)
                a[i] *= 2;
        }
        return a;
    }

    public static int[][] diagonally(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a[i].length - 1 - i] = 1;
        }
        return a;
    }

    public static void arrayminmax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min)
                min = a[i];
            else if (a[i] >= max)
                max = a[i];
        }
        System.out.println("Максимальное чсло в массиве - " + max);
        System.out.println("Минимальное число в массиве - " + min);
    }

    public static boolean checkBalance(int[] a) {
        int sumleft = 0;
        int sum = 0;
        boolean x = true;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        if (sum % 2 != 0) {
            x = false;
            return x;
        }
        sum = sum / 2;
        for (int i = 0; i < a.length; i++) {
            sumleft += a[i];
            if (sum == sumleft) {
                x = true;
                break;
            }
            if (sumleft > sum) {
                x = false;
                return x;
            }
        }
        return x;
    }

    static void shiftToN(int[] a, int cycle) {
        if (cycle > 0) {
            for (int i = 0; i < cycle; i++) {
                int buffer = a[0];
                a[0] = a[a.length - 1];
                for (int y = 1; y < a.length - 1; y++) {
                    a[a.length - y] = a[a.length - y - 1];
                }
                a[1] = buffer;
            }
        }
        else{
            cycle=-cycle;
            for (int y = 0; y < cycle; y++){
            int buffer = a[a.length-1];
            a[a.length - 1] = a[0];
            for (int i = 1; i < a.length -1; i++) {
                a[i - 1] = a[i];
            }
            a[a.length-2] = buffer;
        }
        }
    }
}