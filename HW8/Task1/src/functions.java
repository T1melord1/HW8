import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class functions {
    //#1 Создать массив из 10 целых чисел. Значения могут быть любыми!
    //todo
    //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
    //todo
    public static int[] createMass() {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int razmer = scanner.nextInt();
        int[] mass = new int[razmer];
        System.out.println("Заполните массив размерностью " + razmer);
        for (int i = 0; i < mass.length ; i++) {
            int chislo = scanner.nextInt();
            mass[i] = chislo;
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }
    //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
    //todo
    public static void printMassFromEnd(int[] mass){
        for (int i = mass.length-1; i >=0 ; i--) {
            System.out.print(mass[i]+ " ");
        }
    }
        //#4 *** Задание особой сложности. Написать программу, которая сгенерирует случайный вес 10 людям в пределах
    // от 40 до 100 кг.(Нужно самостоятельно найти информацию, как генерировать числа в заданном диапазоне).
    //
    //Далее вам нужно будет вычислить несколько показателей:
    //1. Средний вес всех людей.
    //2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно. .
        //todo
    public static void weightOfThePeople(){
        int people = 10;
        Random random = new Random();
        int allWeight = 0;
        int averageWeight = 0;
        for (int i = 1; i <= people ; i++) {
        int weight = 40 + random.nextInt(61);
            System.out.println("Вес человека " + (i) +": " + weight + " кг");
            allWeight += weight;
        }
    averageWeight = allWeight / people;
        System.out.println("Средний вес всех " + people +" людей: " + averageWeight);
    }
}

