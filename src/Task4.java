public class Task4 {
    public static void main(String[] args) {
        double[] mass = {1.3, 4.0, 15.3, 43.0, 7.4};
        boolean unique = true;
        two: for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j] && i != j) {
                    unique = false;
                    break two;
                }
            }
        }
        if (unique) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

