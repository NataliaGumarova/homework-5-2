public class Task3 {
    public static void main(String[] args) {
        char[] mass = {'q', 'q', 'q', 'q', 'q'};
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[0] != mass[i]) {
                System.out.println("Элементы массива разные");
                break;
            } else {
                a += 1; //считает одинаковые элементы
            }
        }
        if (a == mass.length) {
            System.out.println("Элементы массива одинаковые");
        }
    }
}