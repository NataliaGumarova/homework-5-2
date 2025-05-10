import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        String[] mass0 = {"dog", "land", "tree", "scanner", "orange", "october"};
        String[] mass = new String[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int t = rand.nextInt(4) + 1;// кол-во слов в 1 строке
            mass[i] = "";
            for (int k = 1; k <= t; k++) {
            String a = mass0[rand.nextInt(6)];
            String b = "";
            int b1 = rand.nextInt(5) + 1;// кол-во пробелов после слова
            while (b1 >= 0 && k != t) {
                b = b + " ";
                b1 -= 1;
                }
            mass[i] = mass[i] + a + b;
            }
        }
        System.out.println(Arrays.toString(mass));
        int r = 0;
        String b = "";
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(mass[i]);
            while (st.hasMoreTokens()) {
              r += 1; // счётчик слов
              b = b + st.nextToken();
            }
        }
        System.out.println("Массив содержит " + r + " слов");
    }
}