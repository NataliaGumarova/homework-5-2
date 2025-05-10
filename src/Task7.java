import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = random.nextInt(10) + 3;
        }
        int a = 1;
        two: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i] == mass[j] && j < i) {
                    continue two;
                } else if (mass[i] == mass[j] && j > i) {
                    a += 1;
                }
            }
            System.out.println(mass[i] + " - " + a + " раз");
            a = 1;
        }
    }
}
