package clase1;

public class EscribirPares {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int num = 2; // 2 4 6 8 10

        // OPCIÓN 1
        System.out.println("OPCIÓN 1");

        for (int i = num; i <= MAX; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // OPCIÓN 2
        System.out.println("OPCIÓN 2");

        if (num % 2 != 0) {
            num++;
        }

        for (int i = num; i <= MAX; i+=2) {
            System.out.println(i);
        }
    }


}
