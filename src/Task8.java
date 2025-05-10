import java.util.Scanner;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        char[] mass = new char[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(26) + 97;
            mass[i] = (char) number;
        }
        int a = 0;
        two: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i] == mass[j] && j > i) {
                    a += 1;
                } else if (mass[i] == mass[j] && j < i) {
                    continue two;
                }
            }
            if (a >= 3) {
                System.out.println(mass[i]);
                a = 0;
            } else {
                a = 0;
            }
        }
    }
}