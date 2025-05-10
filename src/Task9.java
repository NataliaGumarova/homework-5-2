import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[] mass = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = rand.nextInt(n + 3) - 2;
        }
        System.out.println("Первый массив: " + Arrays.toString(mass));
        int[] mass2 = Arrays.copyOf(mass, mass.length);
        for (int i = 0; i < n; i++) {
            if (mass2[i] < -1) {
                for (int j = 0; j < n; j++) {
                    if (mass2[j] < 0) {
                        mass2[j] = mass2[j] * mass2[j];
                    }
                }
            }
        }
        System.out.println("Второй массив: " + Arrays.toString(mass2));
    }
}
