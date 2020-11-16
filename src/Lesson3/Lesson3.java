package Lesson3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Random;
import java.util.Scanner;
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке
// компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
//2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
// "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
public class Lesson3 {
    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();
    }

    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int randomNumb = randomNumber.nextInt(9);
        int game = 1;
        while (game == 1) {
            System.out.println("Угадайте загаданное число.");
            for (int i = 0; i < 3; i++) {
                if (i < 2)
                    System.out.println("У Вас осталось " + (3 - i) + " попытки. Введите новое число");
                else System.out.println("У Вас осталось " + (3 - i) + " попытка. Введите новое число");
                System.out.println("Введите число");
                int number = scanner.nextInt();
                if (number > randomNumb)
                    System.out.println("Введённое число больше загаданного");
                if (number < randomNumb)
                    System.out.println("Введённое число меньше загаданного");
                if (number == randomNumb) {
                    System.out.println("Вы выиграли");
                    break;
                }
                if (i == 2) {
                    System.out.println("Вы проиграли");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            game = scanner.nextInt();
        }
    }

    public static void guessTheWord() {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int randomNumb = randomNumber.nextInt(24);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[randomNumb];
        System.out.println("Угадайте загаданное слово");
        System.out.println("Введите слово");
        String secretWord = "###############";
        String tryingToGuess;
        do {tryingToGuess = scanner.nextLine();
            if (word.equals(tryingToGuess) != true) {
                for (int i = 0; i < word.length() && i < tryingToGuess.length(); i++) {
                    char letter = word.charAt(i);
                    char letter2 = tryingToGuess.charAt(i);
                    if (letter == letter2) {
                        secretWord = changeCharInPosition(i, letter, secretWord);
                    }
                }
                System.out.println(secretWord);
                System.out.println("Гадайте дальше");
            }
        }
        while (word.equals(tryingToGuess) != true);
        System.out.println("Вы выиграли");
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
}
