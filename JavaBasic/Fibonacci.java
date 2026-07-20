import java.util.*;

class Main {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println(a);

        if (n > 1) {
            System.out.println(b);
        }

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        sc.close();
    }
}