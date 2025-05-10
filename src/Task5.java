import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mass[i] = random.nextInt(20)- 10;
        }
        int a = 1;
        two: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mass[i] == mass[j] && j < i) {
                    continue  two;
                } else if(mass[i] == mass[j] && j > i) {
                    a +=1;
                }
            } if (a > 1) {
                System.out.println(mass[i] + " - " + a + " раз");
            }
            a = 1;
        }
    }
}
