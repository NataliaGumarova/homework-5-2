import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[] mass = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = rand.nextInt(34);
        }
        System.out.println("Массив: " + Arrays.toString(mass));
        System.out.println("Индексы элементов массива, которые делятся\n" +
                "без остатка на значение элемента слева и значение элемента справа : ");
        int a = 0;
        for (int i = 1;i < n - 1; i++) {
            if(mass[i-1] == 0 || mass[i+1] == 0){
                continue;
            }else if(mass[i] % mass[i-1] == 0 && mass[i] % mass[i+1] == 0) {
                a += 1;
                System.out.print(i + " ");
            }
        }
        if (a == 0) {
            System.out.print("-1");
        }
    }
}
