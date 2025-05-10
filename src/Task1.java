public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int f1 = 0;
        mass[0] = 0;
        int f2 = 1;
        mass[1] = 1;
        int f3 = 0;
        for (int m = 2; m <= 14; m++) {
            f3 = f1 + f2;
            mass[m] = f3;
            f1 = f2;
            f2 = f3;
        }
        for(int i = 0; i <= 14; i = i+2) {
            System.out.print(mass[i] + " ");
        }
    }
}
