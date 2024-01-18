import java.util.Arrays;
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
    public static void printMassFromEnd(int[] mass){
        for (int i = mass.length-1; i >=0 ; i--) {
            System.out.print(mass[i]+ " ");
        }
    }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
}

