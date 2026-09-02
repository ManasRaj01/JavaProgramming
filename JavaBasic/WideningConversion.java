class WideningConversion {
    public static void main(String[] args) {

        byte b = 42;

        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;

        System.out.println("Byte to Short: " + s);
        System.out.println("Byte to Int: " + i);
        System.out.println("Byte to Long: " + l);
        System.out.println("Byte to Float: " + f);
        System.out.println("Byte to Double: " + d);

        short s1 = 42;
        int i1 = s1;
        long l1 = s1;
        float f1 = s1;
        double d1 = s1;

        System.out.println("Short to Int: " + i1);
        System.out.println("Short to Long: " + l1);
        System.out.println("Short to Float: " + f1);
        System.out.println("Short to Double: " + d1);

        int i2 = 42;
        long l2 = i2;
        float f2 = i2;
        double d2 = i2;

        System.out.println("Int to Long: " + l2);
        System.out.println("Int to Float: " + f2);
        System.out.println("Int to Double: " + d2);

        long l3 = 42;
        float f3 = l3;
        double d3 = l3;

        System.out.println("Long to Float: " + f3);
        System.out.println("Long to Double: " + d3);

        float f4 = 42.0f;
        double d4 = f4;
        System.out.println("Float to Double: " + d4);

        char ch = 42;
        int ci = ch;
        long cl = ch;
        float cf = ch;
        double cd = ch;
   System.out.println("Char to Int: " + ci);
        System.out.println("Char to Long: " + cl);
        System.out.println("Char to Float: " + cf);
        System.out.println("Char to Double: " + cd);
    }
}