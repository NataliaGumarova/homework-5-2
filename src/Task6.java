import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mass[i] = random.nextInt(20)- 10;
        }
        boolean unique = true;
        two: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mass[i] == mass[j] && j != i) {
                    unique = false;
                    continue two;
                } else {
                    unique = true;
                }
            }
            if (unique) {
                System.out.println(mass[i] + " - " + i + "й элемент");
            }
        }
    }
}
