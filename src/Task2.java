import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[30];
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            mass[i] = random.nextInt(120) - 70;
        }
        int maxMass = MIN_VALUE;
        for (int i = 0; i < 30; i++) {
            if(mass[i] > maxMass) {
                maxMass = mass[i];
            }
        }
        System.out.println("Максимальный элемент = " + maxMass);
        int minMass = MAX_VALUE;
        for (int i = 0; i < 30; i++) {
            if(mass[i] < minMass) {
                minMass = mass[i];
            }
        }
        System.out.println("Минимальный элемент = " + minMass);
    }
}