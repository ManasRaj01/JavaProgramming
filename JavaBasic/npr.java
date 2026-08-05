import java.util.*;

public class npr {
    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv *= i;
        }
        return rv;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        

        int fact = fact(n) / fact(n - r);
    }int npr = nfact/nmrfact;
        System.out.println(n + "P" + r + " = " + npr);
