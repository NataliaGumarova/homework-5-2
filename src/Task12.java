public class Task12 {
    public static void main(String[] args) {
        int[] mass = {1, 5, 3, 5, 1};
        int t = mass.length / 2;
        boolean a = true;
        two: for (int i = 0; i < t; i++) {
            if (mass[i] != mass[mass.length - 1 - i]) {
                a = false;
                break two;
            }
        }
        if (a == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
